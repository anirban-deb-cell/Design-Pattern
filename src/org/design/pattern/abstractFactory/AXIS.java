package org.design.pattern.abstractFactory;

public class AXIS implements Bank {

	private String BName="";
	public AXIS() {
		BName = "AXIS BANK";
	}
	
	@Override
	public String getBankName() {
		return BName;
	}

}
