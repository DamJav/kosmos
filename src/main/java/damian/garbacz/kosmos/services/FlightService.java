package damian.garbacz.kosmos.services;


import damian.garbacz.kosmos.entities.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> findAllFlights();
    void addFlight(Flight flight);
    void deleteFlight(Long id);
}
