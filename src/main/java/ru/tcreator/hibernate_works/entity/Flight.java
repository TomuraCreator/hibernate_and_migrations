package ru.tcreator.hibernate_works.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(schema = "bookings", name = "flights")
public class Flight {

    @Id
    @Column(name="flight_id")
    private int id;

    @Column(name = "flight_no", length = 6)
    private String flightNumber;

    @Column(name = "scheduled_departure")
    private String departure;

    @Column(name = "scheduled_arrival")
    private String arrival;

    @ManyToOne
    @JoinColumn(name = "departure_airport")
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport")
    private Airport arrivalAirport;

    @Column(length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "aircraft_code")
    private Aircraft aircraftCode;

    @Column(name = "actual_departure")
    private String actualDeparture;

    @Nullable
    @Column(name = "actual_arrival")
    private String actualArrival;
}
