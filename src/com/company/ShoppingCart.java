package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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


    public void viewCart(ArrayList<Product> productArray) {
        try {
            for (Product product : productArray) {
                System.out.println("Name: " + product.getProductName() + "\n" + "Price: $" + product.getQuantity() + "\n" + "Quantity: " + product.getQuantity() + "\n" + "Description: " + product.getDescription());
                this.totalPrice(productArray);
            }
        } catch (Exception e) {
            System.out.println("Cart is currently empty.");
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
        productArray.add(product);
        product.setQuantity(product.getQuantity() - 1);
    }

    public void removeProduct(ArrayList<Product> productArray, Product product){
        productArray.remove(product);
        product.setQuantity(product.getQuantity() + 1);
    }

    public void removeItemConsole() {
        for (int i=0; i < this.getProduct().size(); i++) {
            System.out.println(i + 1 + " " + this.getProduct().get(i).toString());
        }

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Product product = (Product) this.getProduct().get(input - 1);
        this.removeProduct(this.getProduct(), product);
    }
}

