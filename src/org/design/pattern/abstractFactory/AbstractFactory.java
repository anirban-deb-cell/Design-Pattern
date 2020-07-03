package org.design.pattern.abstractFactory;

public abstract class AbstractFactory {

	public abstract Bank getBank(String bankName);
	public abstract Loan getLoanInfo(String loanName);
}
