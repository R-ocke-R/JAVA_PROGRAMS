package com.automobile.TwoWheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "UP 15AS 6758";
    }

    @Override
    public String getOwnerName() {
        return "Kaku";
    }

    public int getSpeed(){
        return 80;
    }
    public void cdPlayer(){
        System.out.println("To change Channel press \"F\" ");
        System.out.println("To mute press \"M\" ");
        System.out.println("To increase vol press \"+\" ");
        System.out.println("To decrease vol press \"-\" ");
    }
}
