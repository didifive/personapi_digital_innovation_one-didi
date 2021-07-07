package one.digitalinnovation.didi.personapi.repositories;

import one.digitalinnovation.didi.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
