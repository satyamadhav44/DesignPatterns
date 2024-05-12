package com.sample.design.patterns.factoryPattern.impl;

import com.sample.design.patterns.factoryPattern.interfaces.Automobile;

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
