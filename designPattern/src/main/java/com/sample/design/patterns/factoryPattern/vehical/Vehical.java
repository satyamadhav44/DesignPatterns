package com.sample.design.patterns.factoryPattern.vehical;

import com.sample.design.patterns.factoryPattern.impl.AirPlane;
import com.sample.design.patterns.factoryPattern.interfaces.Automobile;
import com.sample.design.patterns.factoryPattern.impl.Bus;
import com.sample.design.patterns.factoryPattern.impl.Ship;

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
