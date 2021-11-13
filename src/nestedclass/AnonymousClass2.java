package nestedclass;

abstract class Result2
{
    abstract public void calcResult2();
}
public class AnonymousClass2
{
    public static void main(String[] args)
    {
        Result2 obj = new Result2() // anonymous class
        {
            @Override
            public void calcResult2()
            {
                System.out.println("Welcome - 2 - Java lab");
            }
        };
        obj.calcResult2();
    }
}
//////////////////////////////////////////////////////////////////
// using anonymous object
/*
abstract class Result2
{
    abstract public void calcResult2();
}
public class AnonymousClass2
{
    public static void main(String[] args)
    {
         new Result2() // anonymous object
        {
            @Override
            public void calcResult2()
            {
                System.out.println("Welcome - 2 - Java lab");
            }
        }.clacResult();
    }
}
 */