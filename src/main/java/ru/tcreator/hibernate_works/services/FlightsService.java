package ru.tcreator.hibernate_works.services;

import org.springframework.stereotype.Service;
import ru.tcreator.hibernate_works.entity.Flight;
import ru.tcreator.hibernate_works.exceptions.DataNotFound;
import ru.tcreator.hibernate_works.repository.FlightRepository;

@Service
public class FlightsService {
    private final FlightRepository flightRepository;

    public FlightsService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight getFlightData(int id) {
        var tmpFlight = flightRepository.getFlightData(id);

        if(tmpFlight.getId() == 2) {
            throw new DataNotFound("That flight not found!");
        } else {
            return tmpFlight;
        }

    }
}
