package FunctionOverloading;
class A1{}

class B1 extends A1 {}

class C1 extends A1 {}

public class TestHericalInriretance {
        public static void m1(B1 obj){
            System.out.println("ok");
        }
        public static void m1(A1 obj){
            System.out.println("Welcome");
        }
//        public static void m1(C1 obj){
//            System.out.println("GLA");
//        }

        public static void main(String[] args) {
            m1(null);
        }
    }
