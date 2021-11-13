package com.automobile;

import com.automobile.TwoWheeler.Hero;
import com.automobile.TwoWheeler.Honda;

public class Test {
    public static void main(String[] args) {
        Hero h = new Hero();
        Honda ho = new Honda();
        System.out.println(h.getOwnerName());
       System.out.println(  h.getModelName());
        System.out.println(h.getRegistrationNumber());
        h.radio();
    }
}
