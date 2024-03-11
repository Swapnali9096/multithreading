package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread;

public class Main {
	public static void main(String[] args) {
		MyThread mythread1=new MyThread();
		mythread1.start();
	}

}
