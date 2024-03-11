package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Account;

public class Wife extends Thread  {
	private Account account;
	
 public Wife(Account account) {
		this.account = account;
	}

@Override
public void run() {
	account.deposite(2000);
	account.withdraw(5000);
	
	 
}
}
