package myproject.springbeers.beerrest.repositories;

import myproject.springbeers.beerrest.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}