package ir.store.model.service;


import ir.store.model.entity.BaseEntity;
import ir.store.model.repository.CrudRepository;

public class ServiceImpl<T extends BaseEntity, I> {
    public T save(T t) throws Exception {
        try (CrudRepository<T, I> da = new CrudRepository<>()) {
            return da.insert(t);
        }
    }

    public T edit(T t) throws Exception {
        try (CrudRepository<T, I> da = new CrudRepository<>()) {
            return da.update(t);
        }
    }

    public T remove(T t) throws Exception {
        try (CrudRepository<T, I> da = new CrudRepository<>()) {
            t.setDeleted(true);
            return da.update(t);
        }
    }



//    public List<T> queryBuilder(Class<T> tClass){
//        CriteriaBuilder criteriaBuilder = JPA.getJpa().getEntityManager().getCriteriaBuilder();
//
//        CriteriaQuery<T> criteriaQuery= criteriaBuilder.createQuery(tClass);
//        Root<T> from = criteriaQuery.from(tClass);
//        criteriaQuery.select(from)
//                .where(criteriaBuilder.or(criteriaBuilder.equal(from.get("title"),"Stuff Pic 1"), criteriaBuilder.equal(from.get("title"),"Stuff Pic 2")));
//          TypedQuery<T> q = JPA.getJpa().getEntityManager().createQuery(criteriaQuery);
//        return q.getResultList();
//    }
}

