public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // System.out.println(i);  0 1 2 3 4 5 6 (first print then check)
            if (i==6){
                break;
            }
            System.out.println(i); //0 1 2 3 4 5   (first check then print)
        }
    }
}
