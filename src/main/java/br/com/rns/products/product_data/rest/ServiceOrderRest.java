package br.com.rns.products.product_data.rest;


import br.com.rns.products.product_data.entity.Item;
import br.com.rns.products.product_data.entity.ServiceOrder;
import br.com.rns.products.product_data.service.ItemService;
import br.com.rns.products.product_data.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ServiceOrderRest {


    @Autowired
    private ServiceOrderService serviceOrderService;



    @PostMapping(value = "/save", produces = "application/json")
    public ServiceOrder addItem(@RequestBody ServiceOrder serviceOrder) {
        return new HttpEntity<ServiceOrder>(serviceOrderService.createNewServiceOrder(serviceOrder)).getBody();
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<ServiceOrder> findAll() {
        return serviceOrderService.findAll();
    }

    @PatchMapping(value = "/update/status", produces = "application/json")
    public ServiceOrder updateServiceOrder(@RequestBody ServiceOrder serviceOrder) {

        return new HttpEntity<ServiceOrder>(serviceOrderService.updateServiceOrderStatus(serviceOrder)).getBody();
    }

    @GetMapping(value = "/id/{id}", produces = "application/json")
    public ServiceOrder getOrder(@PathVariable String id) {
        return serviceOrderService.findOrder(id);
    }
}
