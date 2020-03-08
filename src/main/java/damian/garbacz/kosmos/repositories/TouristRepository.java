package damian.garbacz.kosmos.repositories;

import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TouristRepository extends JpaRepository<Tourist, Long> {

    List<Tourist> findAll();

    @Query("select f from Flight f where Tourist.id= ?1")
    List<Flight> findAllFlightsIdForTouristId(Long id);


}
