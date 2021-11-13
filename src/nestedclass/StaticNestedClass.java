package nestedclass;

class outer{
     int num1=10;
    static class inner{      // nested class
         int num2=20;
        outer o = new outer();   // object of outer class.
        public void display(){

           // System.out.println(num1);  //show error as we can't directly access this var. so we have to make that
                                        // var "STATIC" OR we have to make the obj of outer class.
            System.out.println(o.num1);   //no error

            System.out.println(num2);
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        outer o2 = new outer();
        System.out.println(o2.num1);
        outer.inner obj = new outer.inner();    // creating a object of inner class.
        obj.display();
    }
}
