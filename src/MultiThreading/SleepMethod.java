package MultiThreading;

class test extends Thread{
    @Override
    public void run() {
        System.out.println("naman");
    }
}
public class SleepMethod{
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
        t1.start();

        try {
            t2.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
