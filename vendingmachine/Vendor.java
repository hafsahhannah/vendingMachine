package vendingmachine;

import java.util.Scanner;
import java.io.*;


public class Vendor extends VendingMachine{
   private final int MAXITEM = 20;
    Scanner in = new Scanner (System.in);
    public void vendorMenu() throws FileNotFoundException{
        System.out.println();
        System.out.println("Hi vendor, Welcome to GEDEGANG");
        System.out.println("What do you wish to do?");
        vendorMenu2();
    }
    public void vendorMenu2() throws FileNotFoundException{
        System.out.println();
        System.out.println("Check Availability\t[1]\nRefill Item\t\t[2]\nSee Transaction History\t[3]\nto Exit\t[4]");
        
        int menu = in.nextInt();
        
        if(menu == 1){
            checkAvail();
        }if(menu == 2){
            refillItem();
        }if(menu == 3){
            generateHistory();
        }if(menu == 4){
            System.out.println("You have logged out from vendor account");
        }
    }

    public void checkAvail () throws FileNotFoundException{
        System.out.println();
        System.out.println("Item\t\t| Quantity");
        System.out.println("Plus99 \t\t| " + plus99.size());
        System.out.println("Popci \t\t| " + popci.size());
        System.out.println("Hell & Sky \t| " + hellnsky.size());        
        System.out.println("Pikapoo \t| " + pikapoo.size());
        System.out.println("Sky juice \t| " + skyjuice.size());
        System.out.println("MAILO \t\t| " + mailo.size());
        System.out.println("Spright \t| " + spright.size());
        System.out.println("Legal Caffeine  | " + legalcaffeine.size());
        
        vendorMenu2();
    }
    
    public void refillItem(){
        
        System.out.println("What item ID do you want to refill? <MAX one type of item is 20 items>");
        
        File stockLog = new File("stock.txt");
            try{
                if(!stockLog.exists()){
                    System.out.println("We had to make a new file.");
                    stockLog.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(stockLog, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                String itemID = "";
                    
        //kalau size + add =<20 boleh tambah
        //kalau size + add > 20 rejected , ask for new input number of item
        Scanner add = new Scanner(System.in);
        int addItem = add.nextInt();
        
                for(int i = 1; i <= addItem ; i++ )
                {   Scanner what = new Scanner(System.in);
                    String whatItem = what.next();
                    
                    if(whatItem == "01"){
                        if(Plus99.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((Plus99.size()+1));
                            System.out.println(itemID);
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + Plus99.size());
                        }//else{System.out.println("Number of item exceeds. Please enter another quantity: ");}
                        //yang else ni tak tahu nak letak kat luar loop mana, yang ni untuk bila dia masukkan item tu, 
                        //bila tambah dengan yang asal, dia lebih 20 
                    }
                    if(whatItem == "02"){
                        if(Popci.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((Popci.size()+1));
                            System.out.println(itemID);
                            VendingMachine.popci.add(new Popci(itemID));
                           // new vendingMachine.Popci.enqueue(new Popci(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + Popci.size());
                        }
                    }
                    if(whatItem == "03"){
                        if(HellNSky.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((HellNSky.size()+1));
                            System.out.println(itemID);
                            VendingMachine.hellnsky.add(new HellNSky(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + HellNSky.size());
                        }
                    }
                    if(whatItem == "04"){
                        if(Pikapoo.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((Pikapoo.size()+1));
                            System.out.println(itemID);
                            
                            VendingMachine.pikapoo.add(new Pikapoo(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + Pikapoo.size());
                        }
                    }
                    if(whatItem == "05"){
                        if(SkyJuice.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((SkyJuice.size()+1));
                            System.out.println(itemID);
                            VendingMachine.skyjuice.add(new SkyJuice(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + SkyJuice.size());
                        } 
                    }
                    if(whatItem == "06"){
                        if(Mailo.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((Mailo.size()+1));
                            System.out.println(itemID);
                            VendingMachine.mailo.add(new Mailo(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + Mailo.size());
                        }
                    }
                    if(whatItem == "07"){
                        if(Spright.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((Spright.size()+1));
                            System.out.println(itemID);
                            //Spright.
                            VendingMachine.spright.add(new Spright (itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + Spright.size());
                        }
                    }
                    if(whatItem == "08"){
                        if(LegalCaffeine.size() + addItem <= MAXITEM){
                            itemID = "01 " + "0" + Integer.toString((LegalCaffeine.size()+1));
                            System.out.println(itemID);
                            VendingMachine.legalcaffeine.add(new LegalCaffeine(itemID));
                            bufferedWriter.write("\n" + itemID);
                            System.out.println("Size of arraylist " + LegalCaffeine.size());
                        }
                    }else{
                     
                        System.out.println("Item ID does not exist");
                    }
                    
                }
                bufferedWriter.close();
//+ timeStamp.toString() \
                System.out.println("Done");
            } catch(IOException e) {
                System.out.println("COULD NOT LOG!!");
            }
    }
    
    
    public void generateHistory() throws FileNotFoundException{
        
        MyStack adu = new MyStack();
                try (
            Scanner a = new Scanner(new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\VendingMachine\\receipt.txt"))) {
            while(a.hasNextLine())
            {
                
                String sentence = a.nextLine();

                adu.push(sentence);
                
            }
            
//            for (int i = 0; i <= adu.getSize() ; i++) {
//                System.out.println("");
//                System.out.print( adu.pop());
//                
//            }
            
       
            
                
                
        }
    }
}
