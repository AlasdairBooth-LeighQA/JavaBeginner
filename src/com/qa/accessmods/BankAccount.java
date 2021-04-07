package com.qa.accessmods;

public class BankAccount {

	//private field = can only be used/accessed inside the class
	// for safeguarding i.e. can't be changed in the runner
	
	private String name;
	private int accountNumber;
	private double balance;

	//Accessing private variables/ to interact with the above, use a getter and setter
	// as below; can right click generate and generate these getters and setters
	
	public String getName() {
		return this.name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
