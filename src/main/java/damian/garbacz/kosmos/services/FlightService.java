package damian.garbacz.kosmos.services;


import damian.garbacz.kosmos.entities.Flight;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {

    List<Flight> findAllFlights();
    void addFlight(Flight flight);
    void deleteFlight(Long id);
    List<Flight> findBookFlights(LocalDate date, Integer cost);
}
