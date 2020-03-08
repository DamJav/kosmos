package damian.garbacz.kosmos.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "flights")
@Getter
@Setter
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private Integer seatsCount;
    @ManyToMany
    private List<Tourist> tourists;
    private Integer ticketPrice;

}
