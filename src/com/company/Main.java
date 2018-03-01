package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Create stores
        Store[] storeArray = Store.generateStores();
        ShoppingCart myCart = new ShoppingCart();


        boolean cont = true;
        do {
            //Print console and accept user input
            printConsole();
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            //Validate userInput
            switch (userInput) {
                case 5:
                    cont = false;
                    break;
                case 4:
                    //removeItem()
                    break;
                case 3:
                    //addItem()
                    break;
                case 2:
                    storeSelection(storeArray);
                    break;
                case 1:
                    //viewCart()
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
        System.out.println("3 Add item");
        System.out.println("4 Remove item");
        System.out.println("5 Exit");
    }

    public static void storeSelection(Store[] storeArray) {
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
        }

    }
}
