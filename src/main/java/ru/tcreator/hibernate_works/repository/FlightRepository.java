package ru.tcreator.hibernate_works.repository;

import org.springframework.stereotype.Repository;
import ru.tcreator.hibernate_works.entity.Flight;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Flight getFlightData(int id) {
        return entityManager
                .createQuery("select fl from Flight fl where fl.id = :id", Flight.class)
                .setParameter("id", id)
                .getSingleResult();
    }


}
