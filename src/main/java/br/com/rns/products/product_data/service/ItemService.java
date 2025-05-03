package br.com.rns.products.product_data.service;


import br.com.rns.products.product_data.Repository.ItemRepository;
import br.com.rns.products.product_data.dto.PartnerDiscountDTO;
import br.com.rns.products.product_data.entity.Item;
import br.com.rns.products.product_data.service.strategy.ItemStrategyFactory;
import br.com.rns.products.product_data.service.strategy.ProductStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {


    private static final boolean ACTIVED = true;

    @Autowired
    private ItemRepository itemRepository;
    private ProductStrategy productStrategy = new ItemStrategyFactory();

    public List<Item> findItemsActived() {
        return itemRepository.findAllByActive(ACTIVED);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public void updatePartnerDiscount(PartnerDiscountDTO discount) {
        var items = itemRepository.findAllByPartner(discount.partner());
        items.forEach(item -> {
            item.setWeightDiscount(discount.weightDiscount());
            item.setExpiresAt(discount.expiresAt());
        });
        itemRepository.saveAll(items);
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    public Item updateItem(Item item) {
        var itemSaved = itemRepository.findById(item.getId()).get();
        productStrategy.updateItemStrategy(item, itemSaved);
        itemRepository.save(itemSaved);
        return item;
    }

    public List<PartnerDiscountDTO> getPartnersDiscount() {
        var itemsActived = itemRepository.findAllByActive(ACTIVED);
        return productStrategy.factoryPartersDiscount(itemsActived);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item getItem(String id) {

        return itemRepository.findById(id).get();
    }
}
