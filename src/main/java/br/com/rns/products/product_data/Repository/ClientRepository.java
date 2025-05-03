package br.com.rns.products.product_data.Repository;

import br.com.rns.products.product_data.entity.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}
