import java.math.BigInteger;

public class Bigdemo {
    static int sum=1;
    static BigInteger sum1 = new BigInteger("1");
    public static BigInteger factorial(int num){
        for (int i = 1; i <=num ; i++) {
            sum1=sum1.multiply(BigInteger.valueOf(i));

        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(factorial(1000));
        BigInteger b=factorial(1000);
        String str= String.valueOf(b);

        System.out.println(str.length());

    }
}
