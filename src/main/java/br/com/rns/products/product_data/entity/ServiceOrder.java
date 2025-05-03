package br.com.rns.products.product_data.entity;


import br.com.rns.products.product_data.config.AuditEntity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("service_order")
public class ServiceOrder extends AuditEntity implements Serializable {

    @Id
    private String id;
    private Long itemId;
    private String fullName;
    private String email;
    private int quantity;
    private String celNumber;
    private String codeAddress;
    private String address;
    private String addressNumber;
    private String sizeClothing;
    private String colorClothing;
    private String detail;
    private double amount;
    private String status;
    private String city;
    private String state;

    public ServiceOrder() {
    }

    public ServiceOrder(String fullName, String email, int quantity, String celNumber, String codeAddress, String address, String addressNumber, String sizeClothing, String colorClothing, String detail, double amount, String status, String city, String state) {
        this.fullName = fullName;
        this.email = email;
        this.quantity = quantity;
        this.celNumber = celNumber;
        this.codeAddress = codeAddress;
        this.address = address;
        this.addressNumber = addressNumber;
        this.sizeClothing = sizeClothing;
        this.colorClothing = colorClothing;
        this.detail = detail;
        this.amount = amount;
        this.status = status;
        this.city = city;
        this.state = state;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

    public String getCodeAddress() {
        return codeAddress;
    }

    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSizeClothing() {
        return sizeClothing;
    }

    public void setSizeClothing(String sizeClothing) {
        this.sizeClothing = sizeClothing;
    }

    public String getColorClothing() {
        return colorClothing;
    }

    public void setColorClothing(String colorClothing) {
        this.colorClothing = colorClothing;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
