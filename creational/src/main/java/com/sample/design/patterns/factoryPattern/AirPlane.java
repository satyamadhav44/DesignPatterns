package com.sample.design.patterns.factoryPattern;
public class AirPlane implements Automobile{
    @Override
    public void fuelType() {
        System.out.println("fuel type is aero fuel");
    }

    @Override
    public void modeOfTransport() {
        System.out.println("Air plane flies in Air ");
    }
}
