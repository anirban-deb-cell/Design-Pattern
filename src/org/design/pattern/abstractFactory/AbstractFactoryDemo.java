package org.design.pattern.abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("BANK"); 
		Bank bank = bankFactory.getBank("HDFC");
		System.out.println(bank);
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("LOAN"); 
		Loan loan = loanFactory.getLoanInfo("HOME");
		loan.getInterastRate(new Double(10.0));
		loan.calculateLoanPayment(new Double(100000.0), 12);
	}

}
