package br.com.rns.products.product_data.service.strategy;

import br.com.rns.products.product_data.dto.PartnerDiscountDTO;
import br.com.rns.products.product_data.entity.Item;

import java.util.List;

public interface ProductStrategy {
    void updateItemStrategy(Item item, Item itemSaved);

    List<PartnerDiscountDTO> factoryPartersDiscount(List<Item> itemsActived);
}
