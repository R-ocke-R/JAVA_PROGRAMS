package CLA;

public class CommandLineArgumentDemo5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("NO VALUE");
        } else {
            for (int i = 0; i <args.length; i++) {
                System.out.print(args[i] + ",");
            }
        }
    }
}