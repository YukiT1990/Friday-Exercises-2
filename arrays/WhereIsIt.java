package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            arrayOfNumbers[i] = (int)(Math.random() * (50 - 1) + 1) + 1;
        }

        System.out.print("Array: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Value to find: ");
        int number = input.nextInt();
        System.out.println();

        if (isNumberThere(arrayOfNumbers, number)) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                if (arrayOfNumbers[i] == number) {
                    String sentence = String.format("%d is in slot %d.", number, i);
                    System.out.println(sentence);
                }
            }
        } else {
            String sentence = String.format("%d is not in the array.", number);
            System.out.println(sentence);
        }

    }

    private static boolean isNumberThere(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
}
