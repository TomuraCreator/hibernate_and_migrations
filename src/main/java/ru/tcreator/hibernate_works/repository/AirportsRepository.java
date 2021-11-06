package ru.tcreator.hibernate_works.repository;


import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import ru.tcreator.hibernate_works.entity.Airport;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AirportsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Airport> getAirport() {
        return entityManager
                .createQuery("select a from Airport a", Airport.class)
                .getResultList();

    }
}
