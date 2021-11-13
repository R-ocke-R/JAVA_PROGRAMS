package Overriding;

class first{
    public  first m1(){                 // co-vairent return type
        System.out.println("inside First m1");
       // return this;
           //  OR
        return new first();
    }
}
class second extends first{
    public second m1(){
        System.out.println("inside Second m1");
        return new second();
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        second s = new second();
        s.m1();


    }
}
