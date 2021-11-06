package ru.tcreator.hibernate_works.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name="aircrafts_data", schema = "bookings")
public class Aircraft {
    @Id
    @Column(name = "aircraft_code", length = 3)
    private String code;

    @Column
    private String model;

    @Column
    private String range;
}
