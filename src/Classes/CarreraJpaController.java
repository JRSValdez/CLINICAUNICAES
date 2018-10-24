/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.exceptions.NonexistentEntityException;
import Classes.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author pedro
 */
public class CarreraJpaController implements Serializable {

    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carrera carrera) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Facultad idfacultad = carrera.getIdfacultad();
            if (idfacultad != null) {
                idfacultad = em.getReference(idfacultad.getClass(), idfacultad.getIdfacultad());
                carrera.setIdfacultad(idfacultad);
            }
            em.persist(carrera);
            if (idfacultad != null) {
                idfacultad.getCarreraList().add(carrera);
                idfacultad = em.merge(idfacultad);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCarrera(carrera.getIdcarrera()) != null) {
                throw new PreexistingEntityException("Carrera " + carrera + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carrera carrera) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera persistentCarrera = em.find(Carrera.class, carrera.getIdcarrera());
            Facultad idfacultadOld = persistentCarrera.getIdfacultad();
            Facultad idfacultadNew = carrera.getIdfacultad();
            if (idfacultadNew != null) {
                idfacultadNew = em.getReference(idfacultadNew.getClass(), idfacultadNew.getIdfacultad());
                carrera.setIdfacultad(idfacultadNew);
            }
            carrera = em.merge(carrera);
            if (idfacultadOld != null && !idfacultadOld.equals(idfacultadNew)) {
                idfacultadOld.getCarreraList().remove(carrera);
                idfacultadOld = em.merge(idfacultadOld);
            }
            if (idfacultadNew != null && !idfacultadNew.equals(idfacultadOld)) {
                idfacultadNew.getCarreraList().add(carrera);
                idfacultadNew = em.merge(idfacultadNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = carrera.getIdcarrera();
                if (findCarrera(id) == null) {
                    throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera carrera;
            try {
                carrera = em.getReference(Carrera.class, id);
                carrera.getIdcarrera();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.", enfe);
            }
            Facultad idfacultad = carrera.getIdfacultad();
            if (idfacultad != null) {
                idfacultad.getCarreraList().remove(carrera);
                idfacultad = em.merge(idfacultad);
            }
            em.remove(carrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carrera> findCarreraEntities() {
        return findCarreraEntities(true, -1, -1);
    }

    public List<Carrera> findCarreraEntities(int maxResults, int firstResult) {
        return findCarreraEntities(false, maxResults, firstResult);
    }

    private List<Carrera> findCarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carrera.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Carrera findCarrera(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carrera.class, id);
        } finally {
            em.close();
        }
    }

    public int getCarreraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carrera> rt = cq.from(Carrera.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
