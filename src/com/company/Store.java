package com.company;
import java.util.ArrayList;

public class Store {
    private String vendorName;
    private int inventory;
    private ArrayList Products;

    //constructor
    public Store(String vendorName, int inventory, ArrayList Products){
        this.vendorName = vendorName;
        this.Products = Products;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public ArrayList getProducts() {
        return Products;
    }

    public void setProducts(ArrayList products) {
        Products = products;
    }

    public void inventory(ArrayList<Product> productArray){
        for (Product product: productArray) {
            System.out.println(product.getProductName() + " - " + product.getQuantity());
        }
    }

}
