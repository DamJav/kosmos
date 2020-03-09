package damian.garbacz.kosmos.services;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;

import java.util.List;

public interface TouristService {

    List<Tourist> findAllTourists();
    void addTourist(Tourist tourist);
    void deleteTourist(Long id);
    List<Flight> findFlightsByTouristId(Long id);
    void addFlightToTourist(Long flightId, Long touristId);
}
