package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.MyResource1;

public class MyThread7 extends Thread{
	private MyResource1 myResource1;

	public MyThread7(MyResource1 myResource1) {
		this.myResource1 = myResource1;
	}
	@Override
	public void run() {
		myResource1.resource();
	}

}
