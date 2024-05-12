package com.sample.design.patterns.abstractDesignPattern.impl.bank;

import com.sample.design.patterns.abstractDesignPattern.interfaces.Bank;

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
