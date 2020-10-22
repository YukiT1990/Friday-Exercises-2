package week2.arraylists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            numbers.add((int)(Math.random() * (100 - 1) + 1) + 1);
        }

        System.out.println("ArrayList: " + numbers);

        int maxNumber = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (maxNumber < numbers.get(i)) {
                maxNumber = numbers.get(i);
            }
        }
        System.out.println("\nThe largest value is " + maxNumber);
    }
}
