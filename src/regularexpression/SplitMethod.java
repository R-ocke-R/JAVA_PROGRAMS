package regularexpression;
import java.util.regex.Pattern;

public class SplitMethod {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");  // [a] split where a is there.
        String str[] =p.split("Durga Software Solutions ");
        for (String s:str) {
            System.out.println(s);
        }
    }
}
