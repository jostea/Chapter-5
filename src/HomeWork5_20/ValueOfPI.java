package HomeWork5_20;

public class ValueOfPI {
    public static void main(String[] args) {

        double PI = 0.0;
        boolean flag = true;
        for (int i = 1; i < 200000; i += 2) {

            PI += (flag) ? (4.0 / i) : ((4.0 / i) * -1);
            flag = !flag;
        }
        System.out.println(PI);

        PI = 0;
        for (int i = 1; i < 800000; i += 2) {

            PI += (flag) ? (4.0 / i) : ((4.0 / i) * -1);
            flag = !flag;
        }
        System.out.println("With 800000 terms  PI will start by 3.14159 "+PI);
    }
}
