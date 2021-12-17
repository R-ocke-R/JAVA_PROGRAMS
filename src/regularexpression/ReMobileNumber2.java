package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReMobileNumber2 {
    public static void main(String[] args) {
        String t = "05656565656";
        Pattern p = Pattern.compile("0?[789][0-9]{9}"); // number start with zero but only have one zero in start.
        // pattern p = Pattern.compile("(0|91)?[789][0-9]{9}"); // number start with zero or 91 but only have one zero in start or 91.
        Matcher m = p.matcher(t);
    }
}
