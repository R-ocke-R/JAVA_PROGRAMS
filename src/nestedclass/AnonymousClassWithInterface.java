package nestedclass;
// all variable in interface are "public static final var_name;".
interface Result3{
    public void m1();

    // in JAVA 1.9 OR ABOVE
    default public void m2()
    {

    }

    static public void m3()
    {

    }

    private void m4()
    {

    }
}
//class cResult3 implements Result3{
//    @Override
//    public void m1() {
//        System.out.println("This is a example ");
//    }
//}
public class AnonymousClassWithInterface {
    public static void main(String[] args) {
        new Result3() {
            @Override
            public void m1() {
                System.out.println("Interface");
            }
        }.m1();

    }
}
