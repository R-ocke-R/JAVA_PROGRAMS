package Testing;

import FunctionOverloading.TestHericalInriretance;

class pen{
    String n;
    String b;
    public void m1(){
        System.out.println(n);
        System.out.println(b);
    }
}
public class t2 {
    public static void main(String[] args) {
        pen p1 = new pen();
        pen p2 = new pen();
        p1.n ="nam";
        p1.b="nam";

        p2.n="nam2";
        p2.b="nam2";
        p1.m1();
        p2.m1();

    }
}
