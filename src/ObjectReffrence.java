class Stu23
{
    int a;
    Stu23(int val)
    {
        a = val;
    }
}
public class ObjectReffrence
{
    public static void main(String[] args) {
        Stu23 obj = new Stu23(67);
        Stu23 obj1= obj;
        System.out.println(obj1);
        System.out.println(obj);
    }
}
