package MultiThreading;

public class SleepInMainMethod {
    public static void main(String[] args) {
        System.out.println("Naman");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException k){
            System.out.println(k);
        }
        System.out.println("Parashar");
    }
}
