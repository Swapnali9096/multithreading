package com.jspider.multithreading.resource;

public class Account1 {
	private double accountBalance;
	public synchronized void deposite(double amount){
		System.out.println("amount of rupees " +amount+ "has been credited.");
		accountBalance += amount;
		System.out.println("current account balance is "+accountBalance);
	}
    public synchronized void withdraw(double amount) {
    	System.out.println("amount of rupees " +amount+ "has been credited.");
    	accountBalance -=amount;
    	System.out.println("current account balance is "+accountBalance);
    }
}
