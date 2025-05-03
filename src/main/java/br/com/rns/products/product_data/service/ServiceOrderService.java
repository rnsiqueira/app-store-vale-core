package br.com.rns.products.product_data.service;


import br.com.rns.products.product_data.Repository.ServiceOrderRepository;
import br.com.rns.products.product_data.entity.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrderService {

    private static final String PENDING = "PENDENTE";
    @Autowired
    private ServiceOrderRepository serviceOrderRepository;


    public ServiceOrder createNewServiceOrder(ServiceOrder serviceOrder) {
        serviceOrder.setStatus(PENDING);
        return save(serviceOrder);
    }

    public ServiceOrder save(ServiceOrder serviceOrder) {
        return serviceOrderRepository.save(serviceOrder);
    }

    public List<ServiceOrder> findAll() {
        return serviceOrderRepository.findAll();
    }

    public ServiceOrder updateServiceOrderStatus(ServiceOrder serviceOrder) {
        var serviceOrderSaved = serviceOrderRepository.findById(serviceOrder.getId()).orElseThrow(NullPointerException::new);
        serviceOrderSaved.setStatus(serviceOrder.getStatus());
        serviceOrderRepository.save(serviceOrderSaved);
        return serviceOrderSaved;
    }

    public ServiceOrder findOrder(String id) {
        return serviceOrderRepository.findById(id).orElseThrow(NullPointerException::new);
    }
}
