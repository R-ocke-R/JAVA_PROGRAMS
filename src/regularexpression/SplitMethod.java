package regularexpression;
import java.util.regex.Pattern;

public class SplitMethod {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");
        String str[] =p.split("Naman Parashar And");
        for (String s:str) {
            System.out.println(s);
        }
    }
}
