package ru.tcreator.hibernate_works.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.hibernate_works.entity.Aircraft;
import ru.tcreator.hibernate_works.repository.AircraftRepos;

@RestController
@RequestMapping("/api")
public class AircraftController {
    private final AircraftRepos aircraftRepository;

    public AircraftController(AircraftRepos aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }


    @GetMapping("/aircraft/{id}")
    public Aircraft getAircraft(@PathVariable String id) {
        return aircraftRepository.findAircraftByCode(id);
    }
}
