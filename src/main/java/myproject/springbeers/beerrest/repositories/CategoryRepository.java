package myproject.springbeers.beerrest.repositories;

import myproject.springbeers.beerrest.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
