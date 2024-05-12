package com.sample.design.patterns.abstractDesignPattern;

import com.sample.design.patterns.abstractDesignPattern.impl.BankLoanCreator;
import com.sample.design.patterns.abstractDesignPattern.interfaces.Bank;
import com.sample.design.patterns.abstractDesignPattern.interfaces.Loan;
import com.sample.design.patterns.abstractDesignPattern.interfaces.factory.AbstractFactory;


public class MainClass {
    public static void main(String[] args) {
        System.out.println(" demonstration of abstract factory pattern ");
        System.out.println(" demonstration of Bank ");

        AbstractFactory abstractFactory = new BankLoanCreator().getFactory("bank");
        Bank bank = abstractFactory.getBank("SBI");
        System.out.println("the bank name is : "+bank.getBankName());

        System.out.println(" and the loan to avail is Home Loan ");
        AbstractFactory loanFactory = new BankLoanCreator().getFactory("loan");
        Loan loan = loanFactory.getLoan("homeLoan");
        System.out.println(" and the loan interest is : " + loan.getLoanInterest(12356.008,2.56,2));

             }
}
