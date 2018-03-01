package com.company;
import java.util.ArrayList;

public class Store {
    private String vendorName;
    private ArrayList Products;

    //constructor
    public Store(String vendorName, ArrayList Products){
        this.vendorName = vendorName;;
        this.Products = Products;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public ArrayList getProducts() {
        return Products;
    }

    public void setProducts(ArrayList products) {
        Products = products;
    }

    public static Store[] generateStores() {
        Product movie1 = new Product("Movie1", 5.00, 5, "Movie1 description");
        Product movie2 = new Product("Movie2", 7.00, 3, "Movie2 description");
        Product movie3 = new Product("Movie3", 3.00, 1, "Movie3 description");
        ArrayList<Product> blockbusterProducts = new ArrayList<Product>();
        blockbusterProducts.add(movie1);
        blockbusterProducts.add(movie2);
        blockbusterProducts.add(movie3);

        Product item1 = new Product("item1", 15.00, 5, "item1 description");
        Product item2 = new Product("item2", 17.00, 3, "item2 description");
        Product item3 = new Product("item3", 13.00, 11, "item3 description");
        ArrayList<Product> circuitCityProducts = new ArrayList<Product>();
        circuitCityProducts.add(item1);
        circuitCityProducts.add(item2);
        circuitCityProducts.add(item3);

        Product item4 = new Product("item4", 15.00, 5, "item4 description");
        Product item5 = new Product("item5", 17.00, 3, "item5 description");
        Product item6 = new Product("item6", 13.00, 11, "item6 description");
        ArrayList<Product> kmartProducts = new ArrayList<Product>();
        kmartProducts.add(item4);
        kmartProducts.add(item5);
        kmartProducts.add(item6);

        Store blockbuster = new Store("Blockbuster", blockbusterProducts);
        Store circuitCity = new Store("CircuitCity", circuitCityProducts);
        Store kmart = new Store("Kmart", kmartProducts);

        Store[] storeArray = { blockbuster, circuitCity, kmart };

        return storeArray;
    }
}