package com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.impl.bank;

import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.Bank;

public class SBI implements Bank
{
    public String bankName;

    public SBI(String bankName){
        this.bankName=bankName;
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
