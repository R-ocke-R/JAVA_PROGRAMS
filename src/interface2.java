
public class interface2 {
     static  int a;
    public static void m()
    {
        a=89;
    }

    public static void main(String[] args) {
        m();
    }

}
interface inter {     //if we are going to use only static var or method so we use interface because it is light.
    public static final int a=90;
    public static void m()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        m();
    }
}