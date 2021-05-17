package com.daniel.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount x = new BankAccount();
		BankAccount y = new BankAccount();

		x.deposit("checking", 1500.00).deposit("savings", 345.75);
		y.deposit("checking", 500.25).deposit("savings", 1000.50);
		
		x.withdraw("checking", 700.00).withdraw("savings", 20.75);
		y.withdraw("checking", 40.25).withdraw("savings", 350.50);

		x.showInfo();
		y.showInfo();

		System.out.println(x.totalAmount());
	}

}
