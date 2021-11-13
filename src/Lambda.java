@FunctionalInterface
interface i1{
    public void m1();
}
public class Lambda {
    public static void main(String[] args) {
        i1 obj = () -> {System.out.println("naman");
        int a=19;
            System.out.println(a);};
    }
}


