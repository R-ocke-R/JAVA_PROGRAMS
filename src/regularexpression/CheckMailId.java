package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckMailId {
    public static void main(String[] args) {
        String  n = "n_cs20@gla.ac.in";
        Pattern p = Pattern.compile("[a-zA-Z.]+_cs[.]?[a-z0-9]*@gla[.]ac[.]in");
        Matcher m = p.matcher(n);
        if(m.find()){
            System.out.println("Valid Email");
            System.out.println(m.group());
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}
