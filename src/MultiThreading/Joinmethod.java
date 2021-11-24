package MultiThreading;

class Test extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("naman"+i);
        }
    }
}
public class Joinmethod {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.start();
        t2.start();
        t3.start();
    }
}
