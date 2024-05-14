package com.sample.design.patterns.creationalDesignPattern.builderPattern.builder;

import com.sample.design.patterns.creationalDesignPattern.builderPattern.impl.CDTypes;
import com.sample.design.patterns.creationalDesignPattern.builderPattern.impl.Samsung;
import com.sample.design.patterns.creationalDesignPattern.builderPattern.impl.Sony;

public class PackingBuilder {

    public CDTypes SonyCd(){
        CDTypes cdTypes = new CDTypes();
        cdTypes.addPacking(new Sony());
        return cdTypes;
    }

    public CDTypes SamsungCd(){
        CDTypes cdTypes = new CDTypes();
        cdTypes.addPacking(new Samsung());
        return cdTypes;
    }
}
