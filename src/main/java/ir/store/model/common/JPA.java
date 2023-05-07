package ir.store.model.common;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPA {
    private static JPA jpa = new JPA();
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("store");

    private JPA(){}

    public static JPA getJpa() {
        return jpa;
    }

    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
