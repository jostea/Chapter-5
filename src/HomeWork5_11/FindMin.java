package HomeWork5_11;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n=input.nextInt();

        int[] array=new int[n];

        int min=0;
        for(int i=0;i<array.length;i++){
            System.out.println("Enter number in array: ");
            array[i]=input.nextInt();
            min=array[0];

            if(array[i]<min){
                min=array[i];
            }

        }

        System.out.println(min);
    }
}
