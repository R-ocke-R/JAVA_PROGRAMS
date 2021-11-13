public class calculator {
    static int num1,num2;

    public static void powerInt(int num1,int num2){
        System.out.println(Math.pow(num1,num2));
    }
    public static void powerDouble(double num1,int num2){
        System.out.println(Math.pow(num1,num2));
    }
}
class qw{
    public static void main(String[] args) {
        calculator.powerInt(2,4);
        calculator.powerDouble(2.5,4);
    }
}
