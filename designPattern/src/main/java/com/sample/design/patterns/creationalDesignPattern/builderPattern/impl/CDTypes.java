package com.sample.design.patterns.creationalDesignPattern.builderPattern.impl;

import com.sample.design.patterns.creationalDesignPattern.builderPattern.Packing;

import java.util.ArrayList;
import java.util.List;

public class CDTypes {
    private List<Packing> CDList = new ArrayList<>();

    public void addPacking(Packing packs){
        CDList.add(packs);
    }

   public void showItems(){
        for(Packing item : CDList){
            System.out.println(" CD Name  : "+item.pack());
            System.out.println(" CD Price : "+item.price());
        }
   }
}
