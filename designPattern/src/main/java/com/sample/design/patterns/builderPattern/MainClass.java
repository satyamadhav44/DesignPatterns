package com.sample.design.patterns.builderPattern;

import com.sample.design.patterns.builderPattern.builder.PackingBuilder;

public class MainClass {
    public static void main(String[] args) {
        PackingBuilder packingBuilder = new PackingBuilder();
        packingBuilder.SamsungCd().showItems();
        packingBuilder.SonyCd().showItems();
    }
}
