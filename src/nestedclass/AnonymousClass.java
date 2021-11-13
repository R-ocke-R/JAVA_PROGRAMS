package nestedclass;
/* Anonymous class
 (Nameless class )
 by using abstract
 by using interface
 */

// here we don't use the concept anonymous class we just use simple abstract class
abstract class Result{
    abstract public void calcResult();
}
class cResult extends Result{
    @Override
    public void calcResult(){
        System.out.println("Welcome");
    }
  }
public class AnonymousClass {
    public static void main(String[] args) {
        cResult obj = new cResult();
        obj.calcResult();
    }
}
