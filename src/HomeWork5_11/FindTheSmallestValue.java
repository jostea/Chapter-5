package HomeWork5_11;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfArray = 0;
        while (sizeOfArray <= 0) {
            System.out.print("Pleas enter quantity of numbers: ");
            sizeOfArray = input.nextInt();
        }

        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter values: ");
            array[i] = input.nextInt();
        }

        int minValueOfSetNumbers = array[0];
        for (int i : array) {
            if (i < minValueOfSetNumbers) {
                minValueOfSetNumbers = i;
            }
        }
        System.out.println("The minValueOfSetNumbers value is: " + minValueOfSetNumbers);
    }
}
