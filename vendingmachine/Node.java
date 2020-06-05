package vendingmachine;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



public class Node extends Buyer {
    Node next;
    String itemid;
    String item;
    int quantity;
    double price;
    int transaction_ID,i;
    String timeStamp;
    double total_price;
    static int quantityTotal;
    static int quantity01 = 0;
    static int quantity08 = 0;
    static int quantity02 = 0 ;
    static int quantity03 = 0 ;
    static int quantity04 = 0;
    static int quantity05 = 0;
    static int quantity06 = 0;
    static int quantity07 = 0;
    
    public Node (){
        
    }
    public Node(int transaction_ID,String timeStamp, String itemid, String item,int quantityTotal, double price,double total_price) {
        this.itemid = itemid;
        this.item = item;
        this.price = price;
        this.transaction_ID = transaction_ID;
        this.timeStamp = timeStamp;
        this.total_price = total_price;
        this.quantity = quantityTotal;
        
        
    }
    
    
    
    public void display() {  
       System.out.println("[" + itemid + "] " +  item  +  " \t RM" + price); 
    }
    // how to make the quantity appears only one 

//    public void item() {
//        System.out.print(this.item + " : ");
//        System.out.print(quantity);
//        System.out.println("[" + itemid + "] " +  item  + "\t"  + quantity + "\tRM" + price);
//        
//        String text = itemid + " " + Integer.toString(quantity);
//        printToFile(text);
//    }
    
    public void display_Receipt () 
    {
        System.out.println("Transaction ID : " + transaction_ID);
        System.out.println(timeStamp);
        System.out.println("Total : RM"+totalAmt);
        String str = Integer.toString(transaction_ID) + " " + timeStamp +  " RM" + Double.toString(price);
//        System.out.println("Transaction ID : " + transaction_ID);
//        System.out.println(timeStamp);
//        System.out.println("Total : RM"+totalAmt);
//        String str = Integer.toString(transaction_ID) + " " + timeStamp +  " RM" + Double.toString(price);
        // to display je lets do hashmap
        
//        printToFile(str);
        
//        for (int j = 0; j < count ; j++) {
//            text += arr[j];
//            printToFile(text);
//        }
        
//         str =  " RM" + Double.toString(total_price) ;
//         printToFile(str);
//         
        
    }
    
    
    
    public int getQuantity01(){
        for (int a= 0 ; a< count ; a++ ){
            if (itemid.equals("01")){
                quantity01 ++;
            }
            
       }
        return quantity01;
    }
    
    public int getQuantity02 (){
        for (int b= 0 ; b< count ; b++ ){
            if (itemid.equals("02")){
                quantity02 ++;
            }
       }
        return quantity02;
    }
    
    public int getQuantity03 (){
        for (int c= 0 ; c< count ; c++ ){
            if (itemid.equals("03")){
                quantity03 ++;
            }
       }
       return quantity03;
    }
    
    public int getQuantity04 (){
        for (int d= 0 ; d< count ; d++ ){
            if (itemid.equals("04")){
                quantity01 ++;
            }
       }
        return quantity04;
    }
    public int getQuantity05 (){
        for (int e= 0 ; e< count ; e++ ){
            if (itemid.equals("05")){
                quantity01 ++;
            }
       }
        return quantity05;
    }
    
    public int getQuantity06 (){
        for (int f= 0 ; f< count ; f++ ){
            if (itemid.equals("06")){
                quantity06 ++;
            }
       }
        return quantity06;
    }
    
    public int getQuantity07(){
        for (int g= 0 ; g< count ; g++ ){
            if (itemid.equals("07")){
                quantity07 ++;
            }
       }
        return quantity07;
    }
    public int getQuantity08 (){
        for (int h= 0 ; h< count ; h++ ){
            if (itemid.equals("08")){
                quantity08 ++;
            }
       }
        return quantity08;
    }
    
    public void getDisplay (){
        //if (itemid.equals("01")){
        
            
                //System.out.println(itemid + "\t" + item + "\t \t \t  " + price + "\t \t    " + getQuantity01 ());
            }
//            else if (itemid.equals("02")){
//                int q2 = getQuantity02 ();
//                System.out.println(itemid + "\t" + item + "\t \t \t  " + price + "\t \t    " +q2);
//            }
            
            
       // }
       //System.out.println("ID \t Name     \t \t Price \t       Quantity"); 
//        System.out.println(itemid + item + price + getQuantity01());
//        System.out.println(itemid + item + price + getQuantity08());
            
        //System.out.println(getQuantity01());
        //System.out.print(getQuantity01());
        //String str = Integer.toString(transaction_ID) + " " + timeStamp +  " RM" + Double.toString(price);
//       System.out.println("Total amount of items you've ordered: " +count);
   //}


    
    public void printToFile(String str)
    {
        
        try ( 
                PrintWriter bw = new PrintWriter(new FileOutputStream("C:\\Users\\ACER\\Documents\\NetBeansProjects\\VendingMachinee\\receipt.txt", true))) {
                bw.println(str);
                
            }
        
        
        
    catch (Exception e) {
    }
       
    }
    
    
    @Override
    public String toString() {
        return itemid;
    }
}

