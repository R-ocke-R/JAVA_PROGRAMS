package nestedclass;

public class NonStaticNestedclass2 {
    int a = 10;
    static int b = 20;
    class inner2{
        public void dis(){
            System.out.println(a);    //10
            System.out.println(b);    //20
        }
    }

    public static void main(String[] args) {
        NonStaticNestedclass2 obj = new NonStaticNestedclass2();
        NonStaticNestedclass2.inner2 ob = obj.new inner2();
        ob.dis();
    }
}
