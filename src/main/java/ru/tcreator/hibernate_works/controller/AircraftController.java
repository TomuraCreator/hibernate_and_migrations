package ru.tcreator.hibernate_works.controller;

import org.springframework.web.bind.annotation.*;
import ru.tcreator.hibernate_works.entity.Aircraft;
import ru.tcreator.hibernate_works.exceptions.DataNotFound;
import ru.tcreator.hibernate_works.repository.AircraftRepos;

@RestController
@RequestMapping("/api")
public class AircraftController {
    private final AircraftRepos aircraftRepository;

    public AircraftController(AircraftRepos aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }


    @GetMapping("/aircraft/{id}")
    @ExceptionHandler(DataNotFound.class)
    public Aircraft getAircraft(@PathVariable String id) {
        return aircraftRepository.findAircraftByCode(id);
    }
}
