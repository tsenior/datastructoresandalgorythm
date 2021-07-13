package com.tinyiko;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);


        System.out.println("the arrays has "+list.size()+ " number of items");
        list.remove(0);
        System.out.println("index of 50 "+list.indexOf(50));
        System.out.println("last index of 20 "+list.lastIndexOf(20));
        System.out.println("contains 70, true of false = "+ list.contains(70));
        System.out.println("afer removing first index, the arrays has "+list.size()+ " number of items");
        System.out.println("ArrayList contains " + list);

        System.out.println("CONVERTING AN ARRAYLIST TO A REGULAR ARRAY");
        Object[] array = list.toArray();
        System.out.println("regular array contains " + Arrays.toString(array));

    }
}
