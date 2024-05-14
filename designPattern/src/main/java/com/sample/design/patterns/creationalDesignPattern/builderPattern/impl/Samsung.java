package com.sample.design.patterns.creationalDesignPattern.builderPattern.impl;

import com.sample.design.patterns.creationalDesignPattern.builderPattern.Company;

public class Samsung extends Company {
    @Override
    public String pack() {
        return "Samsung";
    }

    @Override
    public float price() {
        return 20.25f;
    }
}
