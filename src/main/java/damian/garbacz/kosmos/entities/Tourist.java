package damian.garbacz.kosmos.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="tourists")
@Getter
@Setter
public class Tourist {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surName;
    private String sex;
    private String country;
    private String notes;
    private LocalDate dateOfBirth;
    @ManyToMany
    private List<Flight> flights;
}
