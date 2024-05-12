package com.sample.design.patterns.abstractDesignPattern.interfaces.factory;

import com.sample.design.patterns.abstractDesignPattern.interfaces.Bank;
import com.sample.design.patterns.abstractDesignPattern.interfaces.Loan;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanType);
}
