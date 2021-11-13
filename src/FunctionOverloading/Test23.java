package FunctionOverloading;
class A{}

class B extends A{}

class C extends B{}

public class Test23 {
    public static void m1(B obj){
        System.out.println("ok");
    }
    public static void m1(A obj){
        System.out.println("Welcome");
    }
    public static void m1(C obj){
        System.out.println("GLA");
    }

    public static void main(String[] args) {
        m1(null);
    }
}
