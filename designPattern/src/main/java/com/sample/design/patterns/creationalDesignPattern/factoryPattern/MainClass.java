package com.sample.design.patterns.creationalDesignPattern.factoryPattern;

import com.sample.design.patterns.creationalDesignPattern.factoryPattern.vehical.Vehical;

public class MainClass {

    public static void main(String[] args) {

        Vehical vi = new Vehical();
        vi.getMobility("Bus").fuelType();
        vi.getMobility("Bus").modeOfTransport();
        vi.getMobility("Ship").fuelType();
        vi.getMobility("Ship").modeOfTransport();
        vi.getMobility("AirPlane").fuelType();
        vi.getMobility("AirPlane").modeOfTransport();
    }
}
