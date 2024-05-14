package com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.impl.bank;

import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.Bank;

public class HDFC implements Bank {
    public String bankName;

    public HDFC(String bankName){
        this.bankName=bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
