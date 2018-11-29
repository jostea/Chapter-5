package HomeWork5_12;

public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        double oddProduct=1;

        for(int i=1;i<=15;i++){
            if(i%2!=0){
                oddProduct*=i;
            }
        }
        System.out.println(oddProduct);
    }
}
