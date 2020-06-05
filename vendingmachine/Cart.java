package vendingmachine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Cart extends Node{
public Node tail;
static int number = 0;
int count = 0;
    
    // my linked list constructor
    Cart(){
        tail = null;
    }
    
    public void addNode(int transaction_ID,String timeStamp, String itemid, String item,int quantityTotal, double price,double total_price){
        number++;
        Node node = new Node(transaction_ID,timeStamp, itemid, item,quantityTotal, price, total_price);
        node.next = tail;   
        tail = node;           
        
      
    }
    
    // how to addFirst?
    public void addFirst (int transaction_ID,String timeStamp, String itemid, String item,int quantityTotal, double price,double total_price){
        if(tail == null){
            number++;
            addNode(transaction_ID,timeStamp,  itemid, item,quantityTotal, price ,total_price);
        }
        else{
            number++;
            Node newNode = new Node(transaction_ID,timeStamp,  itemid, item, quantityTotal, price, total_price);
            Node current = tail;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        
       
    }
//    public Node checkSame (){
//        // if dia sama, dia akan display 1 je 
//    }
    
    public Node removeNode(String item){
        Node current = tail;
        Node prev = tail;
        
        while(current.item!=item) {
            if(current.next==null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
        } if(current==tail)
            tail = tail.next;
        else
            prev.next = current.next;
        number--;
       
        return current;
    }
    
    public Node removeFirst(){
        if (tail == null){
            //Nothing to remove
            return tail;
        }
        Node current = tail;
        Node previous = tail;
        
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        //removing first node in linked list
        previous.next = current.next;
        return current;        
    }
    
    public Node removeLast(){
        if(tail == null){
            return tail;
        }
        Node current = tail;
        //removing last in linked list
        tail = tail.next;
        
        return current;
    }
    
    
    public void displayCart(){
        System.out.println("====================CART====================");
        Node node = tail;
            while(node!=null){
                for(int i=0; i<number; i++) {
                    System.out.print(i+1 + ". ");
                    node.display();
                    node = node.next;
            }
                System.out.println("");
        }
    }
    
    public void displayReceipt() throws FileNotFoundException{
        System.out.println("====================R E C E I P T====================");
     
        Node node = tail;
           //node.display_Receipt(); // ni dia display total
           //node.displayAll();
           // ni dia tiru atas punya method
           // tapi camne nak buat same item dia akan tambah dekat quantity sahaja
           // bukan nama, kejap lemme think
           // i rasa yang if (sama, then dia only akan quantity ++ for that item
           // tapi dia akan byk quantity lah 
           // every item akan ada quantity dia
           // so dia akan byk if 
           // yup 
           // while(node!=null){
                
              // for(int i=0; i<number; i++) {
                    // number tu is basically count
                    //System.out.print(i+1 + ". "); //ni untuk tunjuk 1st dgn 2nd
                    //System.out.println(node.displayReceipt());//this one quantity dah ok ?
                    // its just that dia display both
                    
                    //kena buat hashmap untuk kira occurrences 
                    node.display_Receipt();
                    
                   System.out.println("ID \t Name     \t \t Price \t       Quantity");
//
                   node = tail;
                   int q1 = 0;
                   int q2 = 0;
                   int q3 = 0;
                   int q4 = 0;
                   int q5 = 0;
                   int q6 = 0;
                   int q7 = 0;
                   int q8 = 0;
                   for (int k = 0 ; k < number ; k++){
                   
                  // node = node.next;
                   
//                   System.out.println(node.itemid);
                   if (node.itemid.equals("01")){
                            q1++;
                            //System.out.println(node.itemid + node.item + node.price + q1);
                  }
                       else if (node.itemid.equals("02")){
                           q2 ++;
                           
                   }
                       else if (node.itemid.equals("03")){
                           q3 ++;
                   }
                       else if (node.itemid.equals("04")){
                           q4++;
                   }
                       else if (node.itemid.equals("05")){
                           q5++;
                   }
                       else if (node.itemid.equals("06")){
                           q6++;
                   }
                       else if (node.itemid.equals("07")){
                           q7++;
                   }
                       else if (node.itemid.equals("08")){
                           q8++;
                  }
                      
                       node = node.next;
                   
                   }
                   // display quantity of the total price, tapi yang ni akan automatic akan ikut turutan, sebab dia akan check 
                   // dari q1, unless i buat else if then only dia akan 
                   
                   if (q1>=1){
                       System.out.println(Plus99.itemId + " \t " +Plus99.name+ "\t \t \t " +Plus99.price*q1 + "\t \t" + q1);
                   }
                   if (q2>=1){
                       System.out.println(Popci.itemId + " \t " +Popci.name+  " \t \t \t " +Popci.price*q2 + "\t \t" + q2);
                   }
                   if (q3>=1){
                      System.out.println(HellNSky.itemId + " \t " +HellNSky.name+ "\t \t " +HellNSky.price*q3 + "\t \t" + q3);
                   }
                   if (q4>=1){
                     System.out.println(Pikapoo.itemId + " \t " +Pikapoo.name+ "\t \t " +Pikapoo.price*q4 + "\t \t" + q4);
                   }
                   if (q5>=1){
                     System.out.println(SkyJuice.itemId + " \t " +SkyJuice.name+ "\t \t " +SkyJuice.price*q5 + "\t \t" + q5);
                   }
                   if (q6>=1){
                     System.out.println(Mailo.itemId + " \t " +Mailo.name+ "  \t \t " +Mailo.price*q6 + "\t \t" + q6);
                   }
                   if (q7>=1){
                     System.out.println(Spright.itemId + " \t " +Spright.name+ "  \t \t " +Spright.price*q7 + "\t \t" + q7); 
                   }
                   if (q8>=1){
                     System.out.println(LegalCaffeine.itemId + " \t " +LegalCaffeine.name+ "\t \t " +LegalCaffeine.price*q8 + "\t \t" + q8);
                   }
            System.out.println("Total amount of items you've ordered: " +number);
            System.out.println("\n_________Generate History__________");
            generateHistory();
        }
        public void generateHistory() throws FileNotFoundException{
        System.out.println();
        String sentence;
        MyStack adu = new MyStack();
            try (
            Scanner a = new Scanner(new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\VendingMachine\\receipt.txt"))) {
            while(a.hasNextLine())
            {
                
                sentence = a.nextLine();
                
                
                adu.push(sentence);
                count++;
               
               
            }
            
                for (int i = 0; i < count; i++) {
                    System.out.println(adu.pop());
                }
             
            
           
            
            
                }
            
             
    }
}




