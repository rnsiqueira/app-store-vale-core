package br.com.rns.products.product_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableMongoRepositories
public class ProductDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductDataApplication.class, args);

    }

}
