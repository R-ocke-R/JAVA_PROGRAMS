interface  i11{
    default public void m1(){
        System.out.println("Hello");
    }
}

interface i12{
    default public void m1(){
        System.out.println("Welcome");
    }
}

public class interface3 implements i11,i12{
    public void m1()
    {
        i11.super.m1();
        i12.super.m1();
    }

    public static void main(String[] args) {
        interface3 i3 =new interface3();
        i3.m1();
    }
}
