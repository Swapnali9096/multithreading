package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.MyResource;
import com.jspider.multithreading.thread.MyThread5;
import com.jspider.multithreading.thread.MyThread6;

public class Main4 {
	public static void main(String[] args) {
		MyResource myResource=new MyResource();
	    MyThread5 myThread5=new MyThread5(myResource);
	    MyThread6 myThread6=new MyThread6(myResource);
	    myThread5.start();
	    myThread6.start();
	}

}
