package week2.arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            arrayOfNumbers[i] = (int)(Math.random() * (100 - 1) + 1) + 1;
        }


        System.out.print("Array: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();

        int maxNumber = 0;
        int indexNumber = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (maxNumber < arrayOfNumbers[i]) {
                maxNumber = arrayOfNumbers[i];
                indexNumber = i;
            }
        }
        System.out.println("\nThe largest value is " + maxNumber);
        System.out.println("It is in slot " + indexNumber);
    }
}
