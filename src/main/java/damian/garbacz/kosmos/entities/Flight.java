package damian.garbacz.kosmos.entities;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "flights")
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate arrivalDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate departureDate;
    private Integer seatsCount;
    @ManyToMany
    private List<Tourist> tourists;
    private Integer ticketPrice;

}
