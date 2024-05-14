package com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.impl;

import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.factory.AbstractFactory;
import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.factory.BankFactory;
import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.factory.LoanFactory;

public class BankLoanCreator {

    public AbstractFactory getFactory(String choice){
        switch (choice){
            case "bank" : return new BankFactory();
            case "loan" : return new LoanFactory();
            default:{
                System.out.println("invalid choice !! choose either bank/loan");
                return null;
            }
        }
    }
}
