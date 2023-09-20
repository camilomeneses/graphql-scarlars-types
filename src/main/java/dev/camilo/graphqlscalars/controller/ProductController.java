package dev.camilo.graphqlscalars.controller;

import dev.camilo.graphqlscalars.model.Product;
import dev.camilo.graphqlscalars.repository.ProductRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

  private final ProductRepository repository;

  public ProductController(ProductRepository repository) {
    this.repository = repository;
  }

  @QueryMapping
  public List<Product> allProducts(){
    return repository.findAll();
  }
}
