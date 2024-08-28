package bac.dev.se.testapp.repositories;

import bac.dev.se.testapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
