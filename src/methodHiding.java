//class f{
//    public void m1(){
//        System.out.println("Inside F");
//    }
//}
//class ss extends f{
//    public void m1(){
//        System.out.println("Inside second");
//    }
//}
//
//
//public class methodHiding {
//    public static void main(String[] args) {
//        f f= new f();
//        ss s =new ss();
//        f.m1();
//        s.m1();
//        f fs = new ss();
//        f.m1();
//    }
//}

class f{
        public static void m1(){    // we can't override static method it is method hiding;
      System.out.println("Inside F");
    }
}
class ss extends f{
    public static void m1(){
        System.out.println("Inside second");
    }
}
public class methodHiding {
    public static void main(String[] args) {
        f f= new f();
       ss s =new ss();
       f.m1();
       s.m1();
        f fs = new ss();
       f.m1();
    }
}
