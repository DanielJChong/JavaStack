package com.daniel.bankaccount;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private static int numOfAccounts = 0;
	private static double totalAmount = 0;


	private String genAccountNum() {
		return ("" + Math.random()).substring(2, 12);
	}

	public BankAccount() {
		this.accountNumber = genAccountNum();
		numOfAccounts++;
	}

	public double getBalance(String account) {
		if(account == "checking") {
			return this.checkingBalance;
		}
		else if(account == "savings") {
			return this.savingsBalance;
		}
		return 0;
	}

	public BankAccount deposit(String account, double amount) {
		if(account == "checking") {
			this.checkingBalance += amount;
		}
		else if(account == "savings") {
			this.savingsBalance += amount;
		}
		totalAmount += amount;
		return this;
	}

	public BankAccount withdraw(String account, double amount) {
		if(account == "checking"){
			if(amount > this.checkingBalance) {
				System.out.println("Insufficient Funds!");
			} 
			else {
				System.out.println("$"+ amount + " withdrawn!");
				totalAmount -= amount;
				this.checkingBalance -= amount;
			}
		}else if(account == "savings") {
			if(amount > this.savingsBalance){
				System.out.println("Insufficient Funds!");
			} 
			else {
				System.out.println("$"+ amount + " withdrawn!");
				totalAmount -= amount;
				this.savingsBalance -= amount;
			}
		}
		return this;
	}

	public double totalAmount() {
		return this.totalAmount;
	}

	public void showInfo() {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Checking Balance: $" + this.checkingBalance);
		System.out.println("Savings Balance: $" + this.savingsBalance);
	}
}
