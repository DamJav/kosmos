package damian.garbacz.kosmos.repositories;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findFlightById(Long flightId);

    @Query(value = "select * from flights where arrival_date = ?1 AND ticket_price<=?2", nativeQuery = true)
    List<Flight> findAllByArrivalDateAndAndTicketPriceIsBefore(LocalDate ArrivalDate, Integer TicketPrice);

}
