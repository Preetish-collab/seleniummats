package collectionsjava;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String>ll=new LinkedList<String>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Cherry");
       // ll.add("Date");
        ll.add("Orange");
        ll.add(3,"Mango"); // add at specific index
        for(String fruit:ll){
            System.out.println(fruit);
        }
        System.out.println(ll.size());
    }
}
