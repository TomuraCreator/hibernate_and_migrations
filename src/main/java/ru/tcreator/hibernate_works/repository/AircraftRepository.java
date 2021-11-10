package ru.tcreator.hibernate_works.repository;
import org.springframework.stereotype.Repository;
import ru.tcreator.hibernate_works.entity.Aircraft;
import ru.tcreator.hibernate_works.exceptions.DataNotFound;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Repository
public class AircraftRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Aircraft getAircraftList(String id) {
        return entityManager
                .createQuery("select a from Aircraft a where a.code=:id", Aircraft.class)
                .setParameter("id", id)
                .getSingleResult();

    }
}
