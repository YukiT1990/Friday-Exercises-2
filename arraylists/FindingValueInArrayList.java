package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            numbers.add((int)(Math.random() * (50 - 1) + 1) + 1);
        }

        System.out.print("ArrayList: " + numbers);

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Value to find: ");
        int userInput = input.nextInt();
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == userInput) {
                System.out.println(userInput + " is in the ArrayList.");
            }
        }
    }
}
