package com.beanlifecycle.usexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coninjection.Person;

public class TestXml {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/usexml/bean-use.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook();
		
	}
}
