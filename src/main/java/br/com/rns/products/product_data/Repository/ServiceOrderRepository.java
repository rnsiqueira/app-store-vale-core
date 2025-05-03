package br.com.rns.products.product_data.Repository;


import br.com.rns.products.product_data.entity.ServiceOrder;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ServiceOrderRepository extends MongoRepository<ServiceOrder, String> {

}
