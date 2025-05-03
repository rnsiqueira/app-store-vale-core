package br.com.rns.products.product_data.entity;


import br.com.rns.products.product_data.config.AuditEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("item")
public class Item extends AuditEntity implements Serializable {

    @Id
    private String id;
    @Indexed(unique = true)
    private Long itemId;
    private String pathImage;
    private String description;
    private String itemName;
    private String partner;
    private String partnerLink;
    private double price;
    private int weightDiscount;
    private boolean active;
    private String category;
    private String expiresAt;

    public Item() {
    }

    public Item(Long itemId, String pathImage, String description, String itemName, String partner, String partnerLink, double price, int weightDiscount, boolean active, String category, String expiresAt) {
        this.itemId = itemId;
        this.pathImage = pathImage;
        this.description = description;
        this.itemName = itemName;
        this.partner = partner;
        this.partnerLink = partnerLink;
        this.price = price;
        this.weightDiscount = weightDiscount;
        this.active = active;
        this.category = category;
        this.expiresAt = expiresAt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getPartnerLink() {
        return partnerLink;
    }

    public void setPartnerLink(String partnerLink) {
        this.partnerLink = partnerLink;
    }

    public int getWeightDiscount() {
        return weightDiscount;
    }

    public void setWeightDiscount(int weightDiscount) {
        this.weightDiscount = weightDiscount;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
