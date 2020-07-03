package org.design.pattern.abstractFactory;

public class ICICI implements Bank{
	
	private String BName="";
	public ICICI() {
		BName = "ICICI";
	}
	
	@Override
	public String getBankName() {
		return BName;
	}

}
