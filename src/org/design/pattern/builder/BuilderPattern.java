package org.design.pattern.builder;

public class BuilderPattern {
	
	private long accountNumber; //This is important, so we'll pass it to the constructor.
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;
    
    private BuilderPattern() {}
    
    public BuilderPattern(long accountNumber) {
    	this.accountNumber =accountNumber;
    }
    
    public BuilderPattern setOwner(String owner) {
    	this.owner = owner;
    	return this;
    }
    
    public BuilderPattern setBranch(String branch) {
    	this.branch = branch;
    	return this;
    }
    
    public BuilderPattern setBalance(double balance) {
    	this.balance = balance;
    	return this;
    }
    
    public BuilderPattern setInterest(double interestRate) {
    	this.interestRate = interestRate;
    	return this;
    }
    
    public BuilderPattern build() {
    	BuilderPattern builderPattern = new BuilderPattern();
    	builderPattern.accountNumber=this.accountNumber;
    	builderPattern.owner=this.owner;
    	builderPattern.branch=this.branch;
    	builderPattern.balance=this.balance;
    	builderPattern.interestRate=this.interestRate;
    	
    	return builderPattern;
    }
    
    
    
    
    

}
