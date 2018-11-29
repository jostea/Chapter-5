package HomeWork5_17;

import java.util.Random;

public class Counter {

    public static void main(String[] args) {


        Random random = new Random();
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].setQuantitySold(random.nextInt(50));
            products[i].setProductNumber(i + 1);
        }

        double[] price = new double[5];

        for (int i = 0; i < products.length; i++) {
            switch (products[i].getProductNumber()) {
                case 1:
                    price[i] = products[i].getQuantitySold() * 2.98;
                    break;
                case 2:
                    price[i] = products[i].getQuantitySold() * 4.50;
                    break;
                case 3:
                    price[i] = products[i].getQuantitySold() * 9.98;
                    break;
                case 4:
                    price[i] = products[i].getQuantitySold() * 4.98;
                    break;
                case 5:
                    price[i] = products[i].getQuantitySold() * 2.98;
                    break;
            }
        }

        for (int i = 0; i < price.length; i++)
            System.out.println("Price of " + (i+1) + " product: " + price[i]);
    }
}
