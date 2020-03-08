package damian.garbacz.kosmos.repositories;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
