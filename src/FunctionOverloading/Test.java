package FunctionOverloading;
/*
overloading--
Same name multiple form
Q) how we can achieve it?

1-By providing different parameters
a) void m1 ()
b) void m1 (int a)
c) void m1 (int a, int b)

2-By passing different type of argument
a) void m1 (int a)
b) void m1(String a)

3- By interchanging the parameters
a) void m1 (int a, String b)
b) void m1 (String b, int a)
 */
public class Test {
    public static void main(String[] args) {
        Exam obj = new Exam(); //new operator is used to create the object.
                               // constructor is used to initlize the object not to create the object.
        Exam obj1 =new Exam(19,"LLB",898);
        Exam obj2 = new Exam(11,890);
        obj.display();
        obj1.display();
        obj2.display();
    }
}
