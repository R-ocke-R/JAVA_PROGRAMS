package nestedclass;

class outer1{
    int a=10;
    class inner1{
        int a=20;
        public void disp(){
            int a=30;
            System.out.println(a);                //30
            System.out.println(this.a);          //20
            System.out.println(outer1.this.a);  //10
        }
    }
}
public class NonStaticNestedclass {
    public static void main(String[] args) {
        outer1 ob = new outer1();
        outer1.inner1 obj2 = ob.new inner1();    // creating a object of inner class.
        obj2.disp();
    }
}
