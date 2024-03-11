package com.jspider.multithreading.resource;

public class Food {
private boolean available;
public synchronized void order() {
	System.out.println("order is received");
	if(available) {
		System.out.println("order is delivered");
	}
	else {
		System.out.println("food is not available");
		System.out.println("wait for some time..");
	}
	try {
		wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if(available) {
		System.out.println("order is delivered");
	}
}
public synchronized void prepare() {
	System.out.println("food is getting prepared");
	System.out.println("food is prepared");
	available=true;
	notify();
}
}
