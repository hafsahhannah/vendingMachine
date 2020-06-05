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
public class HellNSky {
    static String name;
    static String id;
    static String itemId;
    static Double price;
    static int size;
    
    HellNSky(String id)
    {
        name = "Hell&Sky";
        this.id = id;
        this.itemId = "03";
        //System.out.println(id);
        price = 2.00;
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
    public static int size (){
        return size;
    }
    
}

