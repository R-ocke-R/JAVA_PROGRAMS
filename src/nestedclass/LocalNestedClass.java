package nestedclass;
class o{
    public void m1(){
        class i{
            public void m2(){
                System.out.println("Welcome");
            }
        }
        i ii = new i();
        ii.m2();
    }
}
public class LocalNestedClass {
    public static void main(String[] args) {
        o oo = new o();
        oo.m1();
    }
}
