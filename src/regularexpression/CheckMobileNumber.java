package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMobileNumber {
    public static void main(String[] args) {
        String  n = "9412513024";
        Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
        Matcher m = p.matcher(n);
        if(m.find() && m.group().equals(n)){
            System.out.println("Valid Mobile Number");
            System.out.println(m.group());
        }
        else{
            System.out.println("Invalid Mobile Number");
        }
    }
}
