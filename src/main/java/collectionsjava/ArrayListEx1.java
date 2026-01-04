package collectionsjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(10); // Duplicate value
        al.add(60);
        //al.remove(6); // remove value at index 6
       // al.set(6, 70); // set value at index 6
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println("Size of arraylist:" +al.size());// size of arraylist

    }
}