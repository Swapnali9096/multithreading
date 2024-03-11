package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Food;

public class Customer extends Thread {
private Food food;

public Customer(Food food) {
	this.food = food;
}

public void run() {
	food.order();
}
}
