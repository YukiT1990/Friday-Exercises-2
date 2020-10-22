package week2.arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int arrayOfNumbers[] = new int[10];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            // (Math.random() * (Max - Nin) + 1) + Min
            arrayOfNumbers[i] = (int)(Math.random() * (100 - 1) + 1) + 1;
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            String sentence = String.format("Slot %d contains a %d", i, arrayOfNumbers[i]);
            System.out.println(sentence);
        }
    }
}
