package ru.tcreator.hibernate_works.entity;
import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="airports_data", schema = "bookings")
public class Airport {

    @Id
    @Column(name = "airport_code")
    private String code;

    @Column(name = "airport_name")
    private String name;

    @Column
    private String city;

    @Column
    private String coordinates;

    @Column
    private String timezone;

}
