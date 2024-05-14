package com.sample.design.patterns.singletonePattern;

import java.util.Objects;

public class SingleObject {

    private static SingleObject singleObject=null;

    private SingleObject(){
        System.out.println("this is a singleton constructor ");
    }

    public static SingleObject getSingleObject() {
        if(Objects.isNull(singleObject)) {
            singleObject=new SingleObject();
        }
          return singleObject;
    }
}
