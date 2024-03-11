package com.jspider.multithreading.resource;

public class Account {
	private double accountBalance;
	public void deposite(double amount) {
		System.out.println("amount of rupees "+amount+ "has been cridited");
		accountBalance +=amount;
		System.out.println("current account balance is "+accountBalance);
	}
    public void withdraw(double amount) {
		System.out.println("amount of rupees "+amount+ "has been cridited");
		accountBalance -=amount;
		System.out.println("current account balance is "+accountBalance);

    }
}
