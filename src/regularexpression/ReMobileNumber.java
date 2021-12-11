package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReMobileNumber {
    public static void main(String[] args) {
        String t="5656565656";
        Pattern p = Pattern.compile("m?"); //two digit together
        Matcher m = p.matcher(t);

    }
}
