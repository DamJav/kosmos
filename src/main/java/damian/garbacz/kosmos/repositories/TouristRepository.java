package damian.garbacz.kosmos.repositories;

import damian.garbacz.kosmos.entities.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long> {

    List<Tourist> findAll();
}
