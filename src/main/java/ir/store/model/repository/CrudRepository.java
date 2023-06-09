package ir.store.model.repository;

import ir.store.model.common.JPA;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Map;

public class CrudRepository<T, I> implements AutoCloseable {
    private EntityManager entityManager;

    public T insert(T t) {
        entityManager = JPA.getJpa().getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
        return t;
    }

    public T update(T t) {
        entityManager = JPA.getJpa().getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(t);
        entityTransaction.commit();
        return t;
    }

    public T delete(Class<T> tClass, I id) {
        System.out.println(tClass);
        entityManager = JPA.getJpa().getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        T entity = entityManager.find(tClass, id);
        entityManager.remove(entity);
        entityTransaction.commit();
        return entity;
    }

    public T selectById(Class<T> tClass, I id) {
        entityManager = JPA.getJpa().getEntityManager();
        T entity = entityManager.find(tClass, id);
        return entity;
    }

    public List<T> selectAll(Class<T> tClass) {
        entityManager = JPA.getJpa().getEntityManager();
        String sql = "select entity from " + tClass.getAnnotation(Entity.class).name() + " entity ";
        Query query = entityManager.createQuery(sql);
        List<T> tList = query.getResultList();
        return tList;
    }

    public List<T> executeQuery(String queryName, Map<String, Object> paramMap) {
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createNamedQuery(queryName);
        for (String key : paramMap.keySet()) {
            query.setParameter(key, paramMap.get(key));
        }
        List<T> tList = query.getResultList();
        return tList;
    }


    @Override
    public void close() throws Exception {
        entityManager.close();
    }
}
