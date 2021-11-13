package assignment;

public class Calc {
    public static int powerInt(int n1 , int n2){
        return (int) Math.pow(n1,n2);
    }
    public  static double powerDouble(double n1 , double n2){
        return Math.pow(n1,n2);
    }
}
class dis{
    public static void main(String[] args) {
        System.out.println(Calc.powerInt(2,4));
        System.out.println(Calc.powerDouble(2,4));
    }
}