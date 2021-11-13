package FunctionOverloading;

class parent1{
    int n;
    parent1(){
        n=10_000;
    }
}

class child1 extends  parent1{
    int n;
    child1() {
        n=80_000;
    }
    public void m1(){
        System.out.println(n);
        System.out.println(super.n);
    }
}
public class SuperDot {
    public static void main(String[] args) {
        child1 c = new child1();
        c.m1();
    }
}