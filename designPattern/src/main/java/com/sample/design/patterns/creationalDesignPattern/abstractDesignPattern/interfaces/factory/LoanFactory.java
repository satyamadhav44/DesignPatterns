package com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.factory;


import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.impl.loan.HomeLoan;
import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.impl.loan.VehicleLoan;
import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.Bank;
import com.sample.design.patterns.creationalDesignPattern.abstractDesignPattern.interfaces.Loan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {

        switch (loanType){
            case "homeLoan" : return new HomeLoan(1230.78,2.3,2);
            case "vehicleLoan" : return new VehicleLoan(7892.08,8.3,2);
            default:{
                System.out.println("invalid loan type");
                return null;
            }
        }
    }
}
