package exceptionhandling;

public class StackTrace {
    public static void m1() {
        System.out.println(10/0);
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args) {
        m2();
    }
}
