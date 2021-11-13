public class PrentDemo {
    public int page;
    public String pname;
    public void setvalue()
    {
        page = 10;
        pname = "abc";
    }

    // constructor overloading
//  ParentDemo()
//  {
//    super(); // ?  what is the meaning of this
//  }
    // non parameterised constructor
    PrentDemo()  // normal method
    {
        page = 10;
        pname = "abc";
    }
    // parameterised constructor
    PrentDemo(int ta1, String ta2)
    {
        page = ta1;
        pname = ta2;
    }
    public void displayvalue()
    {
        //ParentDemo();
        System.out.println(page + "\t" + pname);
    }
}
// Execution class
class ParentDemoMain
{
    public static void main(String[] args) {
        PrentDemo o1 = new PrentDemo();
        PrentDemo o2 = new PrentDemo(60,"xyz");


        o1.displayvalue();

    }
}