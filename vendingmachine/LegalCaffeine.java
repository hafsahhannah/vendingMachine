/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author User
 */
public class LegalCaffeine {
    static String name;
    static String id;
    static String itemId;
    static Double price;
    static int size;
    
    LegalCaffeine (String id){
        name = "LegalCaffeine";
        this.id = id;
        price = 2.00;
        this.itemId = "08";
    }
    public void display (double userInput){
        if (userInput >= price){
        System.out.printf("[%s] %-20s RM%.2f Available\n", itemId, name, price);
        }
        else {
          System.out.printf("[%s] %-20s RM%.2f Not Available\n", itemId, name, price);  
        }
    }
    
    public void displayItem (){
        System.out.printf("[%s] %-20s RM%.2f \n", itemId, name, price);
    }
    public static int size(){
        return size;
    }
}
