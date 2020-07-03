package org.design.pattern.abstractFactory;

public abstract class Loan {
	
	protected double rate;
	
	abstract void getInterastRate(double rate);
	
	public void calculateLoanPayment(double loadAmount, int years ) {
		
		double EMI;  
        int n;  
 
        n=years*12;  
        rate=rate/1200;  
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loadAmount;  
 
        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loadAmount+" you have borrowed");     
	}

}
