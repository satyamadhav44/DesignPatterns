package com.sample.design.patterns.builderPattern.builder;

import com.sample.design.patterns.builderPattern.impl.CDTypes;
import com.sample.design.patterns.builderPattern.impl.Samsung;
import com.sample.design.patterns.builderPattern.impl.Sony;

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
