package ru.tcreator.hibernate_works.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tcreator.hibernate_works.entity.Aircraft;

public interface AircraftRepos extends CrudRepository<Aircraft, String> {
    Aircraft findAircraftByCode(String code);
}
