package MultiThreading;
public class MultiThreadingUningAnominousClass {
    public static void main(String[] args) {
        Thread obj = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Hello"+i);
                }
            }
        };
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main"+i);
        }
    }

}
