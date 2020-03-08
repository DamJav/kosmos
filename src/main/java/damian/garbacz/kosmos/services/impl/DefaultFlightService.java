package damian.garbacz.kosmos.services.impl;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.repositories.FlightRepository;
import damian.garbacz.kosmos.services.FlightService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultFlightService implements FlightService {

    private final FlightRepository flightRepository;

    public DefaultFlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> findAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
