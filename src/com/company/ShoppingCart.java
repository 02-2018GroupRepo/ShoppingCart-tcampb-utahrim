package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList Product;

    public ArrayList getProduct() {
        return Product;
    }

    public void setProduct(ArrayList product) {
        Product = product;
    }

    public ShoppingCart(){};

    public ShoppingCart(ArrayList Product){
        this.Product = Product;
    }
}