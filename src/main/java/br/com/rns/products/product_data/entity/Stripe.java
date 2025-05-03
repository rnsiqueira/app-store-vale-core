package br.com.rns.products.product_data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("client")
public class Stripe implements Serializable {

    @Id
    private String id;
    private String descriptName;
    private String image;
    private String url;


    public Stripe() {
    }

    public Stripe(String descriptName, String image, String url) {
        this.descriptName = descriptName;
        this.image = image;
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescriptName() {
        return descriptName;
    }

    public void setDescriptName(String descriptName) {
        this.descriptName = descriptName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
