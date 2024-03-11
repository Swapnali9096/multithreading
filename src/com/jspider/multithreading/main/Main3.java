package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.MyThread4;

public class Main3 {
public static void main(String[] args) {
	MyThread4 myThread4=new MyThread4();
	myThread4.setName("MyThread4");
	myThread4.setPriority(8);
	myThread4.start();
}
}
