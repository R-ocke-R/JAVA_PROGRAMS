package exceptionhandling;

public class exceptionParentClass {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("common task completed");
        }
//        catch(ArithmeticException e){                 // if we are using Parent class first  we do not need to use these classes.
//            System.out.println("task1 is completed"); // if we use them then we will get compile time error
//        }                                             // but we can use parent class below them.
//        catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("task 2 completed");
//        }

        System.out.println("rest of the code...");
    }
}
