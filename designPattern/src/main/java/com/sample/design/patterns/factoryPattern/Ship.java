package com.sample.design.patterns.factoryPattern;

public class Ship implements Automobile {
    @Override
    public void fuelType() {
        System.out.println(" Ship runs on Diesel");
    }

    @Override
    public void modeOfTransport() {
        System.out.println(" Ship runs on water");
    }
}
