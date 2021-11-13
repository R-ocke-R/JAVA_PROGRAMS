package exceptionhandling;

public class Try_Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10);
            System.exit(0);
        }
        finally {
            System.out.println("gtt");
        }
    }
}
