package exceptionhandling;

// This is a checked Exception that id handled by JVM.
// In previous same ex of runtime stack we create unchecked Exception that is not handled by JVM there is an
//  abnormal termination

public class Lab17Nov {
    public static void m1 () throws InterruptedException{
        m2();
    }
    public static void m2() throws InterruptedException{
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        m1();
        System.out.println("End of the main method");
    }
}
