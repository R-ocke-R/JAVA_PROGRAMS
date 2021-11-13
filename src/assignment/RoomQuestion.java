package assignment;

import Pattern.Pattern15;

import java.security.PublicKey;
import java.util.Scanner;

class Room{
    boolean AC_ON;
    boolean HOME_THEATER_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;
    Room(){
        Scanner sc = new Scanner(System.in);
        System.out.println("AC STATUS");
        AC_ON=sc.nextBoolean();
        System.out.println("HOME THEATER STATUS");
        HOME_THEATER_ON=sc.nextBoolean();
        System.out.println("FAN STATUS");
        FAN_ON=sc.nextBoolean();
        System.out.println("LIGHT STATUS");
        LIGHT_ON=sc.nextBoolean();
    }
    public int dd(){
        int s=0;
        if(AC_ON==true)
            s=s+1200;
        if(HOME_THEATER_ON==true)
            s=s+600;
        if (FAN_ON==true)
            s=s+400;
        if (LIGHT_ON==true)
            s=s+100;
        return s;
    }
}
public class RoomQuestion {
    public static void main(String[] args) {
        Room r = new Room();
        System.out.println();
        if (r.dd()>2000)
            System.out.println("Overload");
        else
            System.out.println("Under control");
    }
}
