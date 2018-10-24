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
public class Cie10CategoriaJpaController implements Serializable {

    public Cie10CategoriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cie10Categoria cie10Categoria) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cie10Categoria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCie10Categoria(cie10Categoria.getCodCat()) != null) {
                throw new PreexistingEntityException("Cie10Categoria " + cie10Categoria + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cie10Categoria cie10Categoria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cie10Categoria = em.merge(cie10Categoria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = cie10Categoria.getCodCat();
                if (findCie10Categoria(id) == null) {
                    throw new NonexistentEntityException("The cie10Categoria with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cie10Categoria cie10Categoria;
            try {
                cie10Categoria = em.getReference(Cie10Categoria.class, id);
                cie10Categoria.getCodCat();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cie10Categoria with id " + id + " no longer exists.", enfe);
            }
            em.remove(cie10Categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cie10Categoria> findCie10CategoriaEntities() {
        return findCie10CategoriaEntities(true, -1, -1);
    }

    public List<Cie10Categoria> findCie10CategoriaEntities(int maxResults, int firstResult) {
        return findCie10CategoriaEntities(false, maxResults, firstResult);
    }

    private List<Cie10Categoria> findCie10CategoriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cie10Categoria.class));
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

    public Cie10Categoria findCie10Categoria(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cie10Categoria.class, id);
        } finally {
            em.close();
        }
    }

    public int getCie10CategoriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cie10Categoria> rt = cq.from(Cie10Categoria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
