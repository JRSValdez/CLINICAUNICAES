/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.exceptions.NonexistentEntityException;
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
public class TipoMedicamentoJpaController implements Serializable {

    public TipoMedicamentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoMedicamento tipoMedicamento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoMedicamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoMedicamento tipoMedicamento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoMedicamento = em.merge(tipoMedicamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoMedicamento.getIdtipoMed();
                if (findTipoMedicamento(id) == null) {
                    throw new NonexistentEntityException("The tipoMedicamento with id " + id + " no longer exists.");
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
            TipoMedicamento tipoMedicamento;
            try {
                tipoMedicamento = em.getReference(TipoMedicamento.class, id);
                tipoMedicamento.getIdtipoMed();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoMedicamento with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoMedicamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoMedicamento> findTipoMedicamentoEntities() {
        return findTipoMedicamentoEntities(true, -1, -1);
    }

    public List<TipoMedicamento> findTipoMedicamentoEntities(int maxResults, int firstResult) {
        return findTipoMedicamentoEntities(false, maxResults, firstResult);
    }

    private List<TipoMedicamento> findTipoMedicamentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoMedicamento.class));
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

    public TipoMedicamento findTipoMedicamento(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoMedicamento.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoMedicamentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoMedicamento> rt = cq.from(TipoMedicamento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
