package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList Product;

    public ShoppingCart(){};
    public ShoppingCart(ArrayList Product){
        this.Product = Product;
    }


    public ArrayList getProduct() {
        return Product;
    }

    public void setProduct(ArrayList product) {
        Product = product;
    }


    public void viewCart(ArrayList<Product> productArray){
        try {
            for (Product product : productArray) {
                System.out.println("Name:" + product.getProductName() + "\n" + "Price: $" + product.getQuantity() + "\n" + "Quantity: " + product.getQuantity() + "Description: " + product.getDescription());
            }
            this.totalPrice(productArray);
        } catch (Exception e) {
            System.out.println("Your shopping cart is currently empty.");
        }
    }

    public void totalPrice(ArrayList<Product> productArray){
        int total = 0;
        for (Product prodcut: productArray) {
            total += prodcut.getPrice();
        }
        System.out.println(total);
    }

    public void addProduct(ArrayList<Product> productArray, Product product) {
        if (product.getQuantity() > 0) {
            productArray.add(product);
            product.setQuantity(product.getQuantity() - 1);
        }
        else {
            System.out.println("There are no more " + product.getProductName() + "avaiable in the store");
        }
    }

    public void removeProduct(ArrayList<Product> productArray, Product product){
        if (productArray.contains(product)) {
            productArray.remove(product);
            product.setQuantity(product.getQuantity() + 1);
        }
        else {
            System.out.println("There is no " + product.getProductName() + " in your cart.");
        }
    }
}

