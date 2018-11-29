package HomeWork5_16;

import java.security.SecureRandom;

public class Asterisks {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
            if (array[i] == 0) {
                array[i] = 1;
            }
        }

        for (int anArray : array) {
            System.out.print(anArray + ": ");

            for (int j = 0; j < anArray; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        int count = 0;
        while (count < array.length) {
            System.out.print(array[count] + " :");
            for (int i = 0; i < array[count]; i++) {
                System.out.print(" *");
            }
            System.out.println();
            count++;
        }


    }
}
