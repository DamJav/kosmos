package damian.garbacz.kosmos.services.impl;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import damian.garbacz.kosmos.repositories.FlightRepository;
import damian.garbacz.kosmos.repositories.TouristRepository;
import damian.garbacz.kosmos.services.TouristService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTouristService implements TouristService {

    private final TouristRepository touristRepository;
    private final FlightRepository flightRepository;

    public DefaultTouristService(TouristRepository touristRepository, FlightRepository flightRepository) {
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Tourist> findAllTourists() {
        return touristRepository.findAll();
    }

    @Override
    public void addTourist(Tourist tourist) {
        touristRepository.save(tourist);
    }

    @Override
    public void deleteTourist(Long id) {
        touristRepository.deleteById(id);
    }

    @Override
    public List<Flight> findFlightsByTouristId(Long id) {
        return flightRepository.findAllFlightsIdForTouristId(id);
    }
}
