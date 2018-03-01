package com.company;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList Product;

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
        for (Product product: productArray) {
            System.out.println("Name:" + product.getProductName() + "\n" + "Price: $" + product.getQuantity() + "\n" + "Quantity: " + product.getQuantity() + "Description: " + product.getDescription());
        }
        this.totalPrice(productArray);
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
}
