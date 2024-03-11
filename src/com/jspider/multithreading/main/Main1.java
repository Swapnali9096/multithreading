package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread1;

public class Main1 {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		Thread thread=new Thread(myThread1);
		thread.start();
		
	}

}
