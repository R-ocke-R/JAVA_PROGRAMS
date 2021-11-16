package exceptionhandling;

//   In this example, try block contains two exceptions.
//   But at a time only one exception occurs and its corresponding catch block is executed.

public class CatchMultipleExceptions2 {

    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}

class MultipleCatchBlock5{
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
                catch(Exception e){
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
