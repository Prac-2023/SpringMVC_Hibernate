package lk.ijse.gdse2023.classproject.util;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class HibernateBTR {

    private static HibernateBTR instance;
    private final EntityManagerFactory entityManagerFactory;

    private HibernateBTR(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public static HibernateBTR getInstance(EntityManagerFactory entityManagerFactory) {
        return instance == null ? (instance = new HibernateBTR(entityManagerFactory)) : instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
