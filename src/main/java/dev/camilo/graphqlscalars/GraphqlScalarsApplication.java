package dev.camilo.graphqlscalars;

import dev.camilo.graphqlscalars.model.Product;
import dev.camilo.graphqlscalars.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class GraphqlScalarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlScalarsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository repository){
		return args -> {
			List<Product> products = List.of(
					new Product("Product 1",true,1.99F,new BigDecimal(19.0), LocalDateTime.now()),
					new Product("Product 2",false,3.99F,new BigDecimal(29.0), LocalDateTime.now()),
					new Product("Product 3", true, 20.99F,new BigDecimal(39.0), LocalDateTime.now()),
					new Product("Product 4", false, 15.99F,new BigDecimal(49.0), LocalDateTime.now()),
					new Product("Product 5", true, 5.99F,new BigDecimal(59.0), LocalDateTime.now())
			);
			/**
			 * Guardar products generados en el repository
			 */
			repository.saveAll(products);

			/**
			 * Mostrar los products
			 */
			repository.findAll().forEach(System.out::println);
		};
	}
}
