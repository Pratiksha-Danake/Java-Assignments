package spring.collection.depinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionDep {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/collection/depinjection/collection-inj-config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}
}
