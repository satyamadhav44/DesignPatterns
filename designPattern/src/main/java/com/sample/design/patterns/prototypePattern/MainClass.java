package com.sample.design.patterns.prototypePattern;

import com.sample.design.patterns.prototypePattern.impl.CarImpl;
import org.slf4j.Logger;


public class MainClass {

    public static void main(String[] args) {

        // the original object car and the clone object should have the same value and characterstics depecting cloneable pattern
        // as it is const effective and less resource utilisation.
        CarImpl car = new CarImpl("Mercedez");
        System.out.println(" the original cartype is : "+ car.getCarType()+" and the hash value is  "+car.hashCode());
        CarImpl carClone = (CarImpl) car.getClone();
        System.out.println(" the clone is : "+carClone.getCarType()+" and the hash value is "+carClone.hashCode());
    }
}
