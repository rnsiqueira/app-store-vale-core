package br.com.rns.products.product_data.service.strategy;

import br.com.rns.products.product_data.dto.PartnerDiscountDTO;
import br.com.rns.products.product_data.entity.Item;

import java.util.HashSet;
import java.util.List;

public class ItemStrategyFactory implements ProductStrategy {
    @Override
    public void updateItemStrategy(Item item, Item itemSaved) {
        itemSaved.setItemName(item.getItemName());
        itemSaved.setPrice(item.getPrice());
        itemSaved.setPartner(item.getPartner());
        itemSaved.setActive(item.isActive());
        itemSaved.setWeightDiscount(item.getWeightDiscount());
        itemSaved.setDescription(item.getDescription());
        itemSaved.setPathImage(item.getPathImage());
        itemSaved.setPartnerLink(item.getPartnerLink());
        itemSaved.setCategory(item.getCategory());
    }

    @Override
    public List<PartnerDiscountDTO> factoryPartersDiscount(List<Item> itemsActived) {
        var hashSet = new HashSet<PartnerDiscountDTO>();
        itemsActived.forEach(item -> {
            hashSet.add(new PartnerDiscountDTO(item.getPartner(), item.getWeightDiscount(), item.getExpiresAt()));
        });
        return hashSet.stream().toList();
    }
}
