package ru.tcreator.hibernate_works.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.hibernate_works.entity.Flight;
import ru.tcreator.hibernate_works.repository.FlightRepository;

@RequestMapping("/api")
@RestController
public class Controller {
    private final FlightRepository flightRepository;

    public Controller(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable int id) {
        return flightRepository.getFlightData(id);
    }
}
