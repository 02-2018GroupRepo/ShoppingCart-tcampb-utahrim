package com.company;

import java.text.Format;

public class Product {

    private String productName;
    private double price;
    private int quantity;
    private String description;

    public Product(String productName, double price, int quantity, String description) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return productName + ": " +
                price + "\n" +
                description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
