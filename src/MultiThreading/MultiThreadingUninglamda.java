package MultiThreading;

public class MultiThreadingUninglamda {
    public static void main(String[] args) {
        Thread obj = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello"+i);
            }
        });
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main"+i);
        }
    }
}
