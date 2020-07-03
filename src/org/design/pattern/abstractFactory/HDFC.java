package org.design.pattern.abstractFactory;

public class HDFC implements Bank {

	private String BName="";
	public HDFC() {
		BName = "HDFC";
	}
	
	@Override
	public String getBankName() {
		return BName;
	}

}
