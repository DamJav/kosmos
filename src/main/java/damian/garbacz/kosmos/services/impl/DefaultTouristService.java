package damian.garbacz.kosmos.services.impl;

import damian.garbacz.kosmos.entities.Tourist;
import damian.garbacz.kosmos.repositories.TouristRepository;
import damian.garbacz.kosmos.services.TouristService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTouristService implements TouristService {

    private final TouristRepository touristRepository;

    public DefaultTouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @Override
    public List<Tourist> findAllTourists() {
        return touristRepository.findAll();
    }

    @Override
    public void addTourist(Tourist tourist) {
        touristRepository.save(tourist);
    }
}
