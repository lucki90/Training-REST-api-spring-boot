package pl.lucky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.lucky.model.Person;

import java.util.Optional;

@RepositoryRestResource(path = "people",
        collectionResourceRel = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {


    @Override
    @RestResource
    Optional<Person> findById(Long id);
}
