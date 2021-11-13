package assignment;

class co{
    static int s=0;
    {
        s=s+1;
    }

}
public class CountNoOfObjects {
    public static void main(String[] args) {
        co a1 = new co();
        co a2 = new co();
        co a3 = new co();
        System.out.println(co.s);
    }
}
