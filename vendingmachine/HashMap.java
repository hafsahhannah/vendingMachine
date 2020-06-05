/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;



public class HashMap {
    //when its static its constant
    //when its final no one can change it
    private static final int SIZE = 16;
    private Entry table[] = new Entry [SIZE];
    
    class Entry{
        //ni you masukkan size
        // entry punya data, ada key and value and next
        String key;
        String value;
        Entry next;
        
        Entry (String key, String value){
            this.key = key;
            this.value = value;
        }
        public void setValue (String value){
            this.value = value;
        }
        public String getValue (){
            return value;
        }
        public String getKey (){
            return key; //kita tak boleh set key sebaa key itu unique identifier
        }
      }
    // so ni you masukkan mapped dalam kelas hashmap
    //return the entry mapped to the key in HashMap
    public Entry get (String k){
        // you tengok dia sama ke tak
        // ni ada return value
        int hash = k.hashCode() % SIZE;
        Entry e = table [hash];
        
        while (e!=null){
            if (e.key.equals(k)){
                return e;
            } 
            e = e.next;
        }
       return null; 
    }
    public void put(String k, String v){
        //since dia akan letak semua, kalau get u nak mapped kan the key je
        int hash = k.hashCode() % SIZE;
        Entry e = table [hash];
        
        if (e!=null){
            if (e.key.equals(k)){
                e.value = v;
            } else {
                while (e.next!=null){
                    e = e.next;
                }
                Entry entryOld = new Entry (k,v);
                e.next = entryOld;
            }
        }
        else {
            Entry entryNew = new Entry (k,v);
            table [hash] = entryNew; 
        }
    }
}

/**
 *
 * @author User
 */
//public class HashMap {
//    // when its static it is constant
//    // when its final, no one can chane it
//    //size of bucket or container
//    // why 16? could be because 2^4
//    
//    private static final int SIZE = 16;
//    private Entry table[] = new Entry[SIZE];
//
// class Entry {
//     final String key; 
//     String value;
//     Entry next; //objec of class Entry to traverse the map
//     
//     Entry (String k, String v){
//         this.key = k;
//         this.value = v;
//     }
//     public String getValue(){
//         return value;
//     }
//     public void setValue (String value){
//        this.value = value;
//     }
//     public String getKey (){
//         return key;
//     }
//}
//
//// return the entry mapped to key in the hashmap
//public Entry get (String k){
//    int hash = k.hashCode() % SIZE ;
//    Entry e = table [hash];
//    
//    //bucket is identified by hashcode
//    // traverse bucket until key is found 
//    // check stack 
//    
//    while (e != null){
//        if (e.key.equals(k)){
//            return e;
//        }
//        e = e.next;
//    }
//    return null;
//}
//public void put (String k, String v){
//    int hash = k.hashCode() % SIZE;
//    Entry e = table [hash];
//    
//    if (e!= null){
//        if (e.key.equals(k)){
//            e.value = v;
//        }
//        else {
//            while (e.next != null){
//                e = e.next;
//            }
//            Entry entryInOldBox = new Entry (k,v);
//            e.next = entryInOldBox;
//        }
//    }
//    else {
//        // create a new entry in the map
//        Entry entryInNewBox = new Entry (k,v);
//        table[hash]= entryInNewBox;
//    }
//}
//
//
//}
