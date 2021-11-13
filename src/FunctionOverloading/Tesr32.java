package FunctionOverloading;

public class Tesr32 {
    public static void m1(float obj){
        System.out.println("ok");
    }
    public static void m1(Integer obj){
        System.out.println("Welcome");
    }
    public static void m1(double obj){
        System.out.println("Gla");
    }
    public static void main(String[] args) {
        m1(12);
    }
}
