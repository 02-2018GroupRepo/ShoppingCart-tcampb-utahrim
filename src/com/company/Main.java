package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Create stores
        Store[] storeArray = Store.generateStores();
        ArrayList<Product> placeholder = new ArrayList<Product>();
        ShoppingCart myCart = new ShoppingCart(placeholder);

        boolean cont = true;
        do {
            //Print console and accept user input
            printConsole();
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            //Validate userInput
            switch (userInput) {
                case 4:
                    cont = false;
                    break;
                case 3:
                    myCart.removeItemConsole();
                    break;
                case 2:
                    storeSelection(storeArray, myCart);
                    break;
                case 1:
                    System.out.println("\n\n\n\n\n");
                    System.out.println("Press enter to return to previous screen");
                    myCart.viewCart(myCart.getProduct());
                    Scanner exit = new Scanner(System.in);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        } while (cont);

    }

    public static void printConsole() {
        System.out.println("1 View Cart");
        System.out.println("2 Select Store");
        System.out.println("3 Remove item");
        System.out.println("4 Exit");
    }

    public static void storeSelection(Store[] storeArray, ShoppingCart myCart) {
        Store blockbuster = storeArray[0];
        Store circuitcity = storeArray[1];
        Store kmart = storeArray[2];
        for (int i=0; i < storeArray.length; i++) {
            System.out.println(i + 1 + " " + storeArray[i].getVendorName());
        }
        System.out.println(storeArray.length + 1 + " Back");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 4:
                //clear console
                System.out.println("\n\n\n\n\n\n");
                break;
            case 3:
                System.out.println("\n\n\n\n\n\n");
                System.out.println("Add to cart or press 4 to return to the previous screen: ");
                Store.printStoreInventory(kmart, myCart);
                break;
            case 2:
                System.out.println("\n\n\n\n\n\n");
                System.out.println("Add to cart or press 4 to return to the previous screen: ");
                Store.printStoreInventory(circuitcity, myCart);
                break;
            case 1:
                System.out.println("\n\n\n\n\n\n");
                System.out.println("Add to cart or press 4 to return to the previous screen: ");
                Store.printStoreInventory(blockbuster, myCart);
                break;
            default:
                System.out.println("\n\n\n\n\n\n");
                System.out.println("Invalid value");
                break;

        }

    }
}
