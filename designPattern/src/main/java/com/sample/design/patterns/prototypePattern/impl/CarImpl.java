package com.sample.design.patterns.prototypePattern.impl;

import com.sample.design.patterns.prototypePattern.interfaces.CarPrototype;

public class CarImpl extends CarPrototype {

    private String carType;

    public CarImpl(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public CarPrototype getClone() {
        return new CarImpl(carType);
    }
}
