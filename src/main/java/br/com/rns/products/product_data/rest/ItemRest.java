package br.com.rns.products.product_data.rest;


import br.com.rns.products.product_data.Repository.StripeRepository;
import br.com.rns.products.product_data.dto.PartnerDiscountDTO;
import br.com.rns.products.product_data.entity.Item;
import br.com.rns.products.product_data.entity.Stripe;
import br.com.rns.products.product_data.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemRest {


    @Autowired
    private ItemService itemService;

    @Autowired
    private StripeRepository stripeRepository;

    @GetMapping("/all")
    public List<Item> getItems() {
        return itemService.findItemsActived();
    }

    @GetMapping("/admin/all")
    public List<Item> getItemsAdmin() {
        return itemService.findItems();
    }

    @GetMapping("/stripe/all")
    public List<Stripe> getItemsStripe() {
        return stripeRepository.findAll();
    }

    @PostMapping(value = "/stripe/save", produces = "application/json")
    public Stripe getItemsStripe(@RequestBody Stripe stripe) {
        return stripeRepository.save(stripe);
    }


    @PostMapping(value = "/save", produces = "application/json")
    public Item addItem(@RequestBody Item item) {
        return new HttpEntity<Item>(itemService.saveItem(item)).getBody();
    }

    @PutMapping(value = "/update", produces = "application/json")
    public Item updateItem(@RequestBody Item item) {
        return new HttpEntity<Item>(itemService.updateItem(item)).getBody();
    }


    @PostMapping(value = "/partner/discount", produces = "application/json")
    public void updateDiscount(@RequestBody PartnerDiscountDTO discount) {
        itemService.updatePartnerDiscount(discount);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
    }

    @GetMapping("/partners")
    public List<PartnerDiscountDTO> getPartners() {
        return itemService.getPartnersDiscount();
    }

    @GetMapping(value = "/id/{id}")
    public Item getItem(@PathVariable String id) {
        return itemService.getItem(id);
    }
}
