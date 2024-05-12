package com.sample.design.patterns.factoryPattern;

public class Bus implements Automobile{
    @Override
    public void fuelType() {
        System.out.println(" bus runs on Diesel");
    }

    @Override
    public void modeOfTransport() {
        System.out.println(" bus run on Road");
    }
}
