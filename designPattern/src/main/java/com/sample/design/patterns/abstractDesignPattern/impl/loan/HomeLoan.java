package com.sample.design.patterns.abstractDesignPattern.impl.loan;

import com.sample.design.patterns.abstractDesignPattern.interfaces.Loan;

public class HomeLoan extends Loan {

    double principal;
    double rate;
    int time;

    public HomeLoan(double principal,double rate,int time){
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }
    @Override
    public double getLoanInterest(double principal, double rate, int time) {
        return principal * Math.pow(1 + rate / 100, time);
    }
}
