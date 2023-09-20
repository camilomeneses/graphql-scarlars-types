package dev.camilo.graphqlscalars.repository;

import dev.camilo.graphqlscalars.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {
}
