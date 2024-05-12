package com.sample.design.patterns.factoryPattern.vehical;

import com.sample.design.patterns.factoryPattern.AirPlane;
import com.sample.design.patterns.factoryPattern.Automobile;
import com.sample.design.patterns.factoryPattern.Bus;
import com.sample.design.patterns.factoryPattern.Ship;

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
