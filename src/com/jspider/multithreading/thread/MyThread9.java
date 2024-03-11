package com.jspider.multithreading.thread;

public class MyThread9 extends Thread {
@Override
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("hello from MyThread9");
		if(i==3) {
			stop();
		}
	}
}
}
