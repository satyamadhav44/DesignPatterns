package com.sample.design.patterns.creationalDesignPattern.factoryPattern.vehical;

import com.sample.design.patterns.creationalDesignPattern.factoryPattern.impl.AirPlane;
import com.sample.design.patterns.creationalDesignPattern.factoryPattern.interfaces.Automobile;
import com.sample.design.patterns.creationalDesignPattern.factoryPattern.impl.Bus;
import com.sample.design.patterns.creationalDesignPattern.factoryPattern.impl.Ship;

public class Vehical {

    public Automobile getMobility(String auto){

        switch(auto){

            case "Bus" : return new Bus();
            case "Ship" : return new Ship();
            case "AirPlane" : return new AirPlane();
            default: {
                System.out.println(" invalid selection ");
                return null;
            }

        }
    }

}
