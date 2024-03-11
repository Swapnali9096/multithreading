package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread2;
import com.jspider.multithreading.thread.MyThread3;

public class Main2 {
	public static void main(String[] args) {
		MyThread2 myThread2=new MyThread2();
		MyThread3 myThread3=new MyThread3();
		myThread2.start();
		myThread3.start();
	}

}
