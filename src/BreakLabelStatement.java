public class BreakLabelStatement {
    public static void main(String[] args) {
        aa:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( j==2)  {
                    break aa;
                }
                System.out.println(i+"  "+j);
            }
        }

    }
}
