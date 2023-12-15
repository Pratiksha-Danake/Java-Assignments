package com.beanlifecycle.byinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coninjection.Person;

public class TestInterface {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/byinterface/bean.xml");
		Samosa s1 = (Samosa) context.getBean("s");
		System.out.println(s1);
		context.registerShutdownHook();
	}
}
