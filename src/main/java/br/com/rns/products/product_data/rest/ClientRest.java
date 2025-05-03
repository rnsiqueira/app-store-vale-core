package br.com.rns.products.product_data.rest;

import br.com.rns.products.product_data.Repository.ClientRepository;
import br.com.rns.products.product_data.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRest {


    @Autowired
    private ClientRepository productRepository;


    @GetMapping("/all")
    public List<Client> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public void addProduct(@RequestBody Client client) {
        productRepository.save(client);
    }
}
