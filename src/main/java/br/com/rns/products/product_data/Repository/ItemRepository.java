package br.com.rns.products.product_data.Repository;


import br.com.rns.products.product_data.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemRepository extends MongoRepository<Item, String> {


    List<Item> findAllByActive(boolean active);

    List<Item> findAllByPartner(String partner);
}
