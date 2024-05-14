package com.sample.design.patterns.creationalDesignPattern.singletonePattern;

public class MainClass {
    public static void main(String[] args) {
        //demo for singleton pattern

        SingleObject singleObject = SingleObject.getSingleObject();
        System.out.println(" the hashcode of this object 1 is "+singleObject.hashCode());
        SingleObject secondObject = SingleObject.getSingleObject();
        System.out.println(" the hashcode of this object 1 is "+secondObject.hashCode());
    }
}
