package br.com.rns.products.product_data.Repository;


import br.com.rns.products.product_data.entity.Stripe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StripeRepository extends MongoRepository<Stripe, String> {

}
