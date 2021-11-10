package ru.tcreator.hibernate_works.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tcreator.hibernate_works.entity.Flight;
import ru.tcreator.hibernate_works.exceptions.DataNotFound;
import ru.tcreator.hibernate_works.services.FlightsService;

@RequestMapping("/api")
@RestController
public class Controller {
    private final FlightsService service;
    public Controller(FlightsService service) {
        this.service = service;
    }


    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable int id) {
        return service.getFlightData(id);
    }
}
