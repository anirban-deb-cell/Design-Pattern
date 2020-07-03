package org.design.pattern.abstractFactory;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoanInfo(String loanName) {
		if(loanName == null) {
			return null;
		}else if(loanName.equalsIgnoreCase("HOME")) {
			return new HomeLoan();
		}else if(loanName.equalsIgnoreCase("EDUCATIONLOAN")) {
			return new EducationLoan();
		}else {
			return null;
		}
	}

}
