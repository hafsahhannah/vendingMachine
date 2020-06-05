package vendingmachine;
import java.io.*;
import java.util.ArrayList;

public class VendingMachine {

    
        static ArrayList<Plus99> plus99 = new ArrayList<>();               //1.5
        static ArrayList<Popci> popci = new ArrayList<>();                 //1.5
        static ArrayList<HellNSky> hellnsky = new ArrayList<>();           //2.0
        static ArrayList<Pikapoo> pikapoo = new ArrayList<>();             //1.5
        static ArrayList<SkyJuice> skyjuice = new ArrayList<>();           //1.0
        static ArrayList<Mailo> mailo = new ArrayList<>();                 //2.5
        static ArrayList<Spright> spright = new ArrayList<>();             //1.5
        static ArrayList<LegalCaffeine> legalcaffeine = new ArrayList<>(); //2.0

        public static void main(String[] args) throws IOException{
            Buyer.readFile();
            Buyer.buyerAction();
            
            
    }
}
