public class AnonymousDemo {
    int pk;// instance variable..
    String ename;
    AnonymousDemo()
    {
        pk=12;
        ename="naman";
    }
    public void show()// instance method.....
    {
        System.out.println(pk);
        System.out.println(ename);
    }
}
class AnonymousDemoMain
{
    public static void main(String[] args) {
        //AnonymousDemo obj=new AnonymousDemo();
        // obj.show();

        //System.out.println();// common statement .....
        // anonymous object creation....
        new AnonymousDemo().show();// this is the anonymous  object creation(simply anonymous means without name)
        // with out name object creation
        //System.out.println(new AnonymousDemo());// it will print the reference or we can say it will print the
        // Hash code value...
        // simply if we create the anonymous object ("only one time use)

    }

}