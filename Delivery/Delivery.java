package Delivery;

import java.util.ArrayList;
import java.util.Scanner;


Client
Driver
Order
 type: enum
        ExpressOrder
        inday 
        food

1, 3, 2, 4, 7, 0



public class Delivery {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        Client c1 = new Client("Bob", 2, true, true, false);
        Client c2 = new Client("Alex", 1, false, true, false);
        
        c1.setFoodDelDis(2);
        c1.setExDelDis(5);
        
        c2.setExDelDis(10);
        
        
    }
}
