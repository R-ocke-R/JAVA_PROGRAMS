package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReMobileNumber {
    public static void main(String[] args) {
        String t="8656565656";
        Pattern p = Pattern.compile("[789][0-9]{9}");
        Matcher m = p.matcher(t);
       while (m.find()){
           System.out.println(m.start());
           System.out.println(m.end());
       }
    }
}
