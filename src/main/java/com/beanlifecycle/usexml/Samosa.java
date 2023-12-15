package com.beanlifecycle.usexml;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("in init method");
	}
	
	public void destroy() {
		System.out.println("in destroy method");
	}
}
