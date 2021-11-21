package MultiThreading;
/*
   Multitasking : Execute Multiple tasks Simultaneously

  -> Multi-tasking is of Two type:
             1)Processed based
             2)Thread based

 -> Small individual units of process is called threads.
 -> It will increase the performance.

 -> We can apply thread by two ways:
    1) Thread class:
    Type of constructor in thread class--:
     1) Thread()
     2) Thread(String name)
     3) Thread(Runnable r)
     4) Thread(Runnable r,String name)

    2) Runnable Interface

 -> STEPS TO CREATE MULTITHREADED APPLICATION (using Thread class)-

 Step 1) Create a class which Extends Thread class.
  class class_name Extends Thread
        {

        }

Step 2) override the run method.
     class class_name Extends Thread
        {
             @Override
             public void run(){
               ** Logic of this thread
             }
        }

Step 3) create the object of the class
       =======
       class_name obj = new class_name();
       OR
       Thread obj = new class_name();  // Polymorphic behaviour

Step 4) call the start method
      obj.start();  (It is in Thread class) //if we don't use start method then our application will not be multithreaded.
      we can override but we did't do this because it will not run it default behaivour and not register are
      thread to thread schudeuler.

(functional interface)
runnable interface (run method is declared in runnable interface )
thread class
class_name (My class)

State in multithreading:
1-new/born state
2-runable
3-running state
4-block state
5-dead/terminated


Q) lifecycle of the thread?
*/

class thred extends Thread{
//    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello"+i);
        }
    }
}

public class MultiThead {
    public static void main(String[] args) {
      thred obj = new thred();
      obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main"+i);
        }
    }
}
//we will always get the different output.