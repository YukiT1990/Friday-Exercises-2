package week2.arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int arrayOfNumbers1[] = new int[10];
        for (int i = 0; i < arrayOfNumbers1.length; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            arrayOfNumbers1[i] = (int)(Math.random() * (100 - 1) + 1) + 1;
        }

        int arrayOfNumbers2[] = new int[10];
        for (int i = 0; i < arrayOfNumbers2.length; i++) {
            arrayOfNumbers2[i] = arrayOfNumbers1[i];
        }

        arrayOfNumbers1[arrayOfNumbers1.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i < arrayOfNumbers1.length; i++) {
            System.out.print(arrayOfNumbers1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int i = 0; i < arrayOfNumbers2.length; i++) {
            System.out.print(arrayOfNumbers2[i] + " ");
        }

    }
}
