class Instanceof2 {
    int roll_number;
    String name;
    Instanceof2()
    {
        roll_number=201550101;
        name="prashant";
    }

}
class b {
    int a;
    int b;
    b()
    {
        a=10;
        b=20;
    }

}
class instanceMain
{
    public static void main(String[] args) {
        Instanceof2 obj=new  Instanceof2();// this is the object creation of the "Instanceof2"
        if(obj instanceof Instanceof2)
        {
            System.out.println(obj.roll_number);
            System.out.println(obj.name);

        }



    }
}
