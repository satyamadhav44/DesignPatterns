package com.sample.design.patterns.builderPattern.impl;

import com.sample.design.patterns.builderPattern.Company;

public class Sony extends Company {
    @Override
    public String pack() {
        return "Sony";
    }

    @Override
    public float price() {
        return 15.02f;
    }
}
