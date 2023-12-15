package com.beanlifecycle.byinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean,DisposableBean{
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
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("in initialing method");
	}

	public void destroy() throws Exception {
		System.out.println("in destroy method");
	}
}
