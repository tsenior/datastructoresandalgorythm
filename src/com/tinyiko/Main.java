package com.tinyiko;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(5);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.addLast(75);


        System.out.println("the linkedList has "+linkedList.size()+ " number of items");
        linkedList.remove(0);
        System.out.println("index of 50 "+linkedList.indexOf(50));
        System.out.println("last index of 20 "+linkedList.lastIndexOf(20));
        System.out.println("linkedList contains 70, true of false = "+ linkedList.contains(70));
        System.out.println("afer removing first index, the linkedList has "+linkedList.size()+ " number of items");
        System.out.println("linkedList contains " + linkedList);

        System.out.println("CONVERTING A LINKEDLIST TO A REGULAR ARRAY");
        Object[] array = linkedList.toArray();
        System.out.println("regular array contains " + Arrays.toString(array));

    }
}
