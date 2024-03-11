package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.MyResource1;

public class Main5 {
public static void main(String[] args) {
	MyResource1 myResource1=new MyResource1();
	MyThread7 myThread7=new MyThread7(myResource1);
	myThread7.setName("MyThread7");
	MyThread8 myThread8=new MyThread8(myResource1);
	myThread8.setName("MyThraed8");
	myThread7.start();
	myThread8.start();
}
}
