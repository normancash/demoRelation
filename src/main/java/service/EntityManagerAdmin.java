package service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String UNIDAD_PERSISTENCE="demopg";

    private EntityManagerAdmin() {}

    public static EntityManager createEntityManager() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory(UNIDAD_PERSISTENCE);
        return emf.createEntityManager();
    }
}
