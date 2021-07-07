package one.digitalinnovation.didi.personapi.repositories;

import one.digitalinnovation.didi.personapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
