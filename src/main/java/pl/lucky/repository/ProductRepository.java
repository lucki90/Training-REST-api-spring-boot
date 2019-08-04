package pl.lucky.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.lucky.model.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {


}
