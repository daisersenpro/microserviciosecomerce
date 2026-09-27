package product_service.dataloader;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import product_service.model.Product;
import product_service.repository.ProductRepository;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class TestDataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Load test data here


        Product product = Product.builder()
                .name("Samsung Galaxy S29")
                .description("Smartphone con IA")
                .price(BigDecimal.valueOf(1200))
                .build();

        productRepository.save(product);

        System.out.println("Datos de producto cargados: " + product.getName());


    }
}
