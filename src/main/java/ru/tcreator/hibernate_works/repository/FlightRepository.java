package ru.tcreator.hibernate_works.repository;

import org.springframework.stereotype.Repository;
import ru.tcreator.hibernate_works.entity.Flight;
import ru.tcreator.hibernate_works.exceptions.DataNotFound;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FlightRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Flight getFlightData(int id) {
        Flight fl = null;
        try {
            fl = entityManager
                    .createQuery("select fl from Flight fl where fl.id = :id", Flight.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (DataNotFound e) {
            throw new DataNotFound(e.getMessage());
        }
        return fl;
    }


}
