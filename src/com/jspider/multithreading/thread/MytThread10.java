package com.jspider.multithreading.thread;

public class MytThread10 extends Thread {
@Override
public void run() {
	String message="java is programing language";
	char []charArray=message.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		System.out.print(charArray[i]);
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
