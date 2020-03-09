package damian.garbacz.kosmos.repositories;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

//    @Query("")
//    List<Flight> findAllFlightsIdForTouristId(Long id);

    Flight findFlightById(Long flightId);
}
