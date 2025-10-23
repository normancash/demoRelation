package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ImplDAO implements IDAO{
    @Override
    public <T> List<T> getAll(String namequery, Class<T> clazz) {
        EntityManager em = EntityManagerAdmin.createEntityManager();
        try {
            TypedQuery<T> query = em.createNamedQuery(namequery, clazz);
            return query.getResultList();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            em.close();
        }
        return null;
    }

    @Override
    public <T> void create(T entity) {
        EntityManager em = EntityManagerAdmin.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.flush();
            em.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally{
            em.close();
        }
    }
}
