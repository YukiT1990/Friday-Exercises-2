package week2.arraylists;

import collections.list.Int;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            numbers.add((int)(Math.random() * (100 - 1) + 1) + 1);
        }

        System.out.print("ArrayList: " + numbers);
    }
}
