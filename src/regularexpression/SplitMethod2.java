package regularexpression;

import java.util.regex.Pattern;

public class SplitMethod2 {
    public static void main(String[] args) {
    Pattern p = Pattern.compile("[.]");  // or   \\. can be used.
    String str[] =p.split("www.durgasoft.com");
    for (String s:str) {
        System.out.println(s);
    }
   }
}
