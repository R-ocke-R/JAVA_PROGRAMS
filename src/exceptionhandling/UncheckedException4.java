package exceptionhandling;
//UncheckedException

//  ***** Null Pointer Exception *****

public class UncheckedException4 {
    //jvm only provide default value to instance variable only static or non-static.
    public static Integer i1;   // nul is provided by JVM

    public static void main(String[] args) {
        int i2;
        i2=i1;   // int can't store null so there is an exception
        System.out.println(i2);
    }
}
