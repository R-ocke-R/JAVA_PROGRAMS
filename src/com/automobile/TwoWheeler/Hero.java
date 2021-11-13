package com.automobile.TwoWheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
    @Override
    public String getModelName() {
        return "Splender";
    }

    @Override
    public String getRegistrationNumber() {
        return "Dl 8BN 9807";
    }

    @Override
    public String getOwnerName() {
        return "Shivansh";
    }

    public int getSpeed(){
        return 80;
    }

    public void radio(){
        System.out.println("To change Channel press \"F\" ");
        System.out.println("To mute press \"M\" ");
        System.out.println("To increase vol press \"+\" ");
        System.out.println("To decrease vol press \"-\" ");
    }
}

