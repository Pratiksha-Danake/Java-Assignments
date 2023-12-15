package com.coninjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/coninjection/coninj-config.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
}
