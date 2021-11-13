/*
interface i1
{
  public abstract method

  default public void method
    {
        default behaviour
    }

    private void method
    {
        with behaviour
    }

    public static void method
    {

    }

    public static final
}
 */
// we introduce default method to extend the funcanility without changing/disturbing  the interfaces classes.
public interface interface1 {
    public void m1();
    public void m2();
    default public void m3(){    // we have to define the default method in interface only.
//        System.out.println("h1");
//        System.out.println("h2");
//        System.out.println("h3");
        m5();    // we call the common line here.
        System.out.println("h5");
        System.out.println("h7");
    }
    default public void m4()
    {
//        System.out.println("h1"); // it is increasing the code retundancy.
//        System.out.println("h2");
//        System.out.println("h3");
        m5();
        System.out.println("h6");
        System.out.println("h8");
    }
     private void m5()  //we define the the common line of code in private method.
    {
        System.out.println("h1");
        System.out.println("h2");
        System.out.println("h3");
    }
}
class first implements interface1{
    @Override
    public void m1(){
        System.out.println("First m1");
    }

    @Override
    public void m2() {
        System.out.println("First m2");
    }
}
class second implements interface1{

    @Override
    public void m1() {
        System.out.println("Second m1");
    }

    @Override
    public void m2() {
        System.out.println("second m2");
    }
    public void m3(){
        System.out.println("This is a default method");
    }
}
class Tst{
    public static void main(String[] args) {

    }
}