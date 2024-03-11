package com.jspider.multithreading.thread;

public class MyThread4 extends Thread {
	@Override
	public void run() {
		System.out.println("hello from MyThread4");
		System.out.println("Id =" +this.getId());
		System.out.println("Name =" +this.getName());
		System.out.println("priority =" +this.getPriority());
	}

}
