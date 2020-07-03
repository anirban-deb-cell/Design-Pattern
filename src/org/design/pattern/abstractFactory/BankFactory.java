package org.design.pattern.abstractFactory;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bankName) {
		
		if(bankName == null) {
			return null;
		}else if(bankName.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}else if(bankName.equalsIgnoreCase("AXIS")) {
			return new AXIS();
		}else if(bankName.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}else {
			return null;
		}
		
	}

	@Override
	public Loan getLoanInfo(String loanName) {
		// TODO Auto-generated method stub
		return null;
	}

}
