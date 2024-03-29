package myproject.springbeers.beerrest.repositories;

import myproject.springbeers.beerrest.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
