public class ArrayPrac {
    public static void main(String[] args) {
        int c = 0;
        int a[][] = new int[2][2];
        if (args.length < 4) {
            System.out.println("please enter 4 values ");
        } else {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = Integer.parseInt(args[c]);
                    c += 1;
                }
            }
            System.out.println("The given Array is:"); //Printing the array
            for (int q = 0; q < a.length; q++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[q][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("The Reverse of the array is:");
            for (int r = (a.length - 1); r >= 0; r--) {
                for (int u = (a.length - 1); u >= 0; u--) {
                    System.out.print(a[r][u] + " ");
                }
                System.out.print("\n");
            }

        }

    }
}
