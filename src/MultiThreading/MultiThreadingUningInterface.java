package MultiThreading;

class  thred1 implements Runnable{
   @Override
       public void run(){
        for (int i = 0; i < 10; i++) {
        System.out.println("Hello"+i);
        }
   }
}
public class MultiThreadingUningInterface {
        public static void main(String[] args) {
                thred1 obj1 = new thred1();
                Thread obj = new Thread(obj1);
                obj.start();
                for (int i = 0; i < 10; i++) {
                        System.out.println("Main"+i);
                }

        }
}
