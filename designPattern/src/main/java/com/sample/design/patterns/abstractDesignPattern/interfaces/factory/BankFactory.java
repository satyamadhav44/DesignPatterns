package com.sample.design.patterns.abstractDesignPattern.interfaces.factory;

import com.sample.design.patterns.abstractDesignPattern.impl.bank.HDFC;
import com.sample.design.patterns.abstractDesignPattern.impl.bank.SBI;
import com.sample.design.patterns.abstractDesignPattern.interfaces.Bank;
import com.sample.design.patterns.abstractDesignPattern.interfaces.Loan;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {

        switch (bankName){
            case "SBI" : return new SBI("SBI");
            case "HDFC" : return new HDFC("HDFC");
            default: {
                System.out.println("invalid bank name");
                return null;
            }
        }

    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
