package FunctionOverloading;

public class Test2 {
    public static void main(String[] args) {
        Exam2 obj = new Exam2(); //new operator is used to create the object. // constructor is used to initlize the object not to create the object
        Exam2 obj1 =new Exam2();
        Exam2 obj2 = new Exam2();
        obj.setval(49,"B.tech",909);
        obj1.setval(34,600);
        obj.display();
        obj1.display();
        obj2.display();
    }
}
