package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.Food;
import com.jspider.multithreading.thread.Customer;
import com.jspider.multithreading.thread.Restaurant;

public class Main7 {
public static void main(String[] args) {
	Food food=new Food();
	Customer customer=new Customer(food);
	customer.start();
	Restaurant restaurant=new Restaurant(food);
	restaurant.start();
}
}
