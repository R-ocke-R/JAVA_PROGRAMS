package String;

public class SplitMethod {
    public static void main(String[] args) {
        String s = "Durga software Solution";
        String ss[]=s.split("\\s");
        for (int i = 0; i <ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
