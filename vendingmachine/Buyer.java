
package vendingmachine;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
//import static vendingmachinee.VendingMachinee.plus99;

public class Buyer extends VendingMachine {
    double pay;
    double totalCart;
    double balance;
    double firstIn;
    static int count;
    static double totalAmt = 0.0 ;
    static String userChoice = "";
    static int userQuantity = 0;
    static String userNo = "";
    
    
    Buyer(){
    this.pay = pay;
    this.balance = balance;
    this.totalCart = totalCart;
    this.firstIn = firstIn;
    }
    
public static void buyerAction() throws FileNotFoundException{
        
        Cart stuff = new Cart();
        Scanner scan = new Scanner (System.in);
        double price = 0.0;
        double totalCart = 0.0;
       // double totalAmt = 0.0;
        double oriAmt = 0.0;
       // String userNo = "";
        // totalCart = harga sebenar barang itu 
        // user can insert money 
        System.out.print("Insert money: ");
        double userInput = scan.nextDouble(); //the money that user will input
        Vendor vendorActivity = new Vendor();
        
        if(userInput == 99){
            vendorActivity.vendorMenu();
        }else{
        //kita buat loop dulu 
        

        //1
           
            //oriAmt is the price amount asal mula2 user masukkan
            oriAmt = userInput;
            System.out.println("---------------------Item catalog----------------------");
            System.out.println("ID \t Name     \t  Price\t\t Availibility");
            
            
            plus99.get(0).display(userInput);
            popci.get(0).display(userInput);
            hellnsky.get(0).display(userInput);
            pikapoo.get(0).display(userInput);
            skyjuice.get(0).display(userInput);
            mailo.get(0).display(userInput);
            spright.get(0).display(userInput);
            legalcaffeine.get(0).display(userInput); 
            System.out.println("-------------------------------------------------------");       
            
            //String userChoice = "";
            
            if (userInput >= 1.0) 
            {
                System.out.println("Add item to cart[item ID]? [00] to exit.");
                userChoice = scan.next();
//                System.out.print("Quantity: ");
                //int userQuantity = scan.nextInt();
            }
            while (!userChoice.equals("00")|| userInput >= 1.0 ){
                if (userChoice.equals("01")) {
                    count++;
                    totalAmt = totalAmt + plus99.get(0).price;
                    stuff.addNode(transaction_ID(),timeStamp(),"01", "99Plus",count, 1.50,totalAmt);
                    userInput -= plus99.get(0).price;
                    plus99.remove(userChoice); 
                }
                else if (userChoice.equals("02")) {
                    
                    count++;
                    totalAmt = totalAmt + popci.get(0).price;
                    //String str = Integer.toString(transaction_ID()) + " " + timeStamp() + " " + "02 " + "Popci " + Integer.toString(count_popci) + " 1.50 " + Integer.toString(totalAmt);
                   stuff.addNode(transaction_ID(),timeStamp(),"02", "Popci",count, 1.50,totalAmt);
                   userInput -= popci.get(0).price;
//                   if (userInput >= popci.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("03")) {
                    
                    count++;
                    totalAmt = totalAmt + hellnsky.get(0).price;
                    stuff.addNode(transaction_ID(),timeStamp(), "03", "Hell&Sky",count, 2.00,totalAmt);
                    userInput -= hellnsky.get(0).price;
//                    if (userInput >= hellnsky.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}                    
                }
                else if (userChoice.equals("04")) {
                    
                    count++;
                    stuff.addNode(transaction_ID(),timeStamp(), "04", "Pikapoo",count, 1.50,totalAmt);
                    totalAmt = totalAmt + pikapoo.get(0).price;
                    userInput -= pikapoo.get(0).price;
//                    if (userInput >= pikapoo.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("05")) {
                   
                    count++;
                    stuff.addNode(transaction_ID(),timeStamp(),"05", "Sky Juice",count, 1.00,totalAmt);
                    totalAmt = totalAmt + skyjuice.get(0).price;
                    userInput -= skyjuice.get(0).price;
//                    if (userInput >= skyjuice.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("06")) {
                   
                    count++;
                    stuff.addNode(transaction_ID(),timeStamp(), "06", "MAILO",count, 2.50,totalAmt);
                    totalAmt = totalAmt + mailo.get(0).price;
                    userInput -= mailo.get(0).price;
//                    if (userInput >= mailo.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("07")) {
                    
                    count++;
                    stuff.addNode(transaction_ID(),timeStamp(), "07", "Spright",count, 1.50,totalAmt);
                    totalAmt = totalAmt + spright.get(0).price;
                    userInput -= spright.get(0).price;
//                    if (userInput >= spright.get(0).price)
//                    {
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("08")) {
                    
                    count++;
                    stuff.addNode(transaction_ID(),timeStamp(),"08", "Legal Caffeine",count, 2.00,totalAmt);
                    totalAmt = totalAmt + legalcaffeine.get(0).price;
                    userInput -= legalcaffeine.get(0).price;
//                    if (userInput >= legalcaffeine.get(0).price)
//                    {
//                    System.out.println();
//                    System.out.println("-------------------------------------------------------");    
//                    System.out.println("Enter another item if you wish to buy more, else [00]");}
                }
                else if (userChoice.equals("00")){
                    break; // if userChoice equals 00, then dia akan add
                }else{
                    System.out.println("invalid item ID");
                }
                System.out.println("Enter Item ID to add more. [00] to exit.");
                userChoice = scan.next();
                
                
            }
        
            stuff.displayCart();
            System.out.println("--------------------------------------------");
            System.out.println("Total price: RM " + totalAmt);            
            System.out.println("--------------------------------------------");
                        
            
            if(oriAmt<totalAmt)
                System.out.println("You exceeded amount of money you entered. Transaction aborted.");
            else { //bigger and equal
                System.out.print("Do you want to cancel any item? (yes/no) ");
                    String userAns = scan.next();
                    if(userAns.equals("yes")) {
                    System.out.println("Enter item code. [00] to exit.");
                    userNo = scan.next();
                    while (!userNo.equals("00")){ 

                        if (userNo.equals("01")) {
                            stuff.removeNode("99Plus");
                            totalAmt = totalAmt - plus99.get(0).price;
                        }
                        else if (userNo.equals("02")) {
                            stuff.removeNode("Popci");
                            totalAmt = totalAmt - popci.get(0).price;
                        }
                        else if (userNo.equals("03")) {
                            stuff.removeNode("Hell&Sky");
                            totalAmt = totalAmt - hellnsky.get(0).price;
                        }
                        else if (userNo.equals("04")) {
                            stuff.removeNode("Pikapoo");
                            totalAmt = totalAmt - pikapoo.get(0).price;
                        }
                        else if (userNo.equals("05")) {
                            stuff.removeNode("Sky Juice");
                            totalAmt = totalAmt - skyjuice.get(0).price;
                        }
                        else if (userNo.equals("06")) {
                            stuff.removeNode("MAILO");
                            totalAmt = totalAmt - mailo.get(0).price;
                        }
                        else if (userNo.equals("07")) {
                            stuff.removeNode("Spright");
                            totalAmt = totalAmt - spright.get(0).price;
                        }
                        else if (userNo.equals("08")) {
                            stuff.removeNode("Legal Caffeine");
                            totalAmt = totalAmt - legalcaffeine.get(0).price;
                        }
                        else if (userChoice.equals("00")){
                            break;
                        }
//                        else if (userChoice.contains(userNo)){
//                            // dia sama dgn before tu kan
//                            
//                        }
                        else{
                        System.out.println("invalid item ID");
                        }
                        
                        System.out.println("Enter another ID to cancel. [00] to exit.");
                        userNo = scan.next();
                        }
                    }
            stuff.displayCart();
            System.out.println("--------------------------------------------");
            System.out.println("Total price: RM " + totalAmt);            
            System.out.println("--------------------------------------------");
            
            System.out.print("Confirm transaction? (yes/no) ");
            String userConfirm = scan.next();
            
            if(userConfirm.equalsIgnoreCase("yes")) {
                System.out.println("Transaction successful.");
                System.out.println("Amount entered: RM" + oriAmt);
                System.out.println("Total amount:  RM" + totalAmt);
                System.out.println("Balance: RM" + (oriAmt-totalAmt));
                System.out.println("Transaction successful!!!! YESYYYYYYYY");
                System.out.println();
                stuff.displayReceipt();
            }
            else
                System.out.println("YOUR CART HAS BEEN EMPTIED AND YOUR TRANSACTION IS ABORTED");
            }
    }
    }


//    public static double getAmt (){
//        return totalAmt;
//    }
       

    
    public static void readFile() throws IOException {      
        Scanner s = new Scanner (new FileInputStream ("C:\\Users\\User\\Documents\\NetBeansProjects\\VendingMachine\\stock.txt"));
        
        while (s.hasNext()){
            String word = s.nextLine();
            //System.out.println(word);
            
            String[] arr = word.split(" ");
            //System.out.println(arr[0]);
            
            if(arr[0].equals("01")){
                //System.out.println(word);
                //create a new object in a space in the arraylist
                plus99.add(new Plus99(word));
               // new vendingMachine().plus99vendor.list.add(new Plus99(word));
               // new vendingMachine().plus99.list.add(new plus99(word));
                
            
            }else if(arr[0].equals("02")){
                 popci.add(new Popci(word));
                 //new vendingMachine().popcivendor.list.add(new Popci(word));
            }
            else if(arr[0].equals("03")){
                hellnsky.add(new HellNSky(word));
                //new vendingMachine().hellnskyvendor.list.add(new HellNSky(word));
            }
            else if(arr[0].equals("04")){
                pikapoo.add(new Pikapoo(word));
                //new vendingMachine().pikapoovendor.list.add(new Pikapoo(word));
            }
            else if(arr[0].equals("05")){
                skyjuice.add(new SkyJuice(word));
               // new vendingMachine().skyjuicevendor.list.add(new SkyJuice(word));
            }
            else if(arr[0].equals("06")){
                mailo.add(new Mailo(word));
               // new vendingMachine().mailovendor.list.add(new Mailo(word));
            }
            else if(arr[0].equals("07")){
                spright.add(new Spright(word));
               // new vendingMachine().sprightvendor.list.add(new Spright(word));
                
            }else if(arr[0].equals("08")){
                legalcaffeine.add(new LegalCaffeine(word));
               // new vendingMachine().legalcaffeinevendor.list.add(new LegalCaffeine(word));
            }else{
                System.out.println("nono");

            
            }
        }
    
        s.close();
        System.out.println("");

    }
    
    
    public static int transaction_ID()
    {
        int transaction_ID = 0;
        
        Random s = new Random();
        transaction_ID = s.nextInt(9000)+1000;
        
       
 
                
//        if(t1 != t2)
//        {
//            if (t1 >999 && t1 <=9999){
//                if(t2 >999 && t2 <=9999){   
//             transaction_ID = ((t1*t2)%1000); 
//             System.out.println(t1);
//             System.out.println(t2);
//             System.out.println(transaction_ID);
//             System.out.println("lululu");
//            }
//                  
//            }
//            else {
//                t1 = s.nextInt(9999) + 1000;
//                t2 = s.nextInt (9999) + 1000;
//                System.out.println(t1);
//                System.out.println(t2);
//                transaction_ID = ((t1*t2)% 1000);
//                System.out.println("lala");
//            }
        
        
            
            //if (transaction_ID < 0 && transaction_ID > 999 ){
//                transaction_ID = (t1*1234/t2*1000)/1000;
//                //System.out.println(transaction_ID);
            
//            if (transaction_ID < 0 && transaction_ID > 999 ){
//                System.out.println(transaction_ID);
//            }
//            else if (transaction_ID > 0 && transaction_ID > 999){
//                System.out.println(transaction_ID);
//            }
//            else if (transaction_ID > 99 || transaction_ID <=999){
//                System.out.println("aisyah busuk");
//                System.out.println(transaction_ID *10);
//           }
//            else {
//                 System.out.println("hannah busuk");
//                 System.out.println(transaction_ID *100);
//           }
//            
            
//                System.out.println(transaction_ID);
            
       
//        System.out.println("return");
//       //System.out.println(transaction_ID);
        return transaction_ID;
            
   }
     
    public static String timeStamp()
    {
        String dateToPrintToFile;
        dateToPrintToFile = null;
        
        SimpleDateFormat tarikh = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = tarikh.format(today);
        dateToPrintToFile = reportDate;
//        System.out.println(dateToPrintToFile);
  

        return dateToPrintToFile;
    }
    
    
    public void insertMoney(){

        System.out.println("Insert money");
        Scanner input = new Scanner (System.in);
        firstIn = input.nextDouble();
    }
    
    
    public void viewCatalog(){
        
        if(firstIn < 1.0){
            System.out.println("Not enough"); //ni semua view tapi semua tak 'menyala'
        }else if(firstIn >=1.0 && firstIn <2.0){
            //nak view semua 
            //nak call method display from skyJuice class tapi tak berjaya :') help
        }
    }

}

