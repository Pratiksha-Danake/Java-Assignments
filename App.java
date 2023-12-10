package com.crud.operation.CrudOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		StudentData student = new StudentData();
		student.setAddress("Sangola");
		student.setCollegeName("Vidyamandir");
		student.setEmail("prathamesh02@gmail.com");
		student.setName("Prathamesh");

		StudentData student1 = new StudentData();
		student1.setAddress("Sangola");
		student1.setCollegeName("KBP");
		student1.setEmail("prtaiksha02@gmail.com");
		student1.setName("Pratiksha");

		Transaction trans = session.beginTransaction();
		session.save(student);
		session.save(student1);
		
//		read
		java.util.List<StudentData> list = session.createQuery("from StudentData",StudentData.class).list();
		list.forEach(e->System.out.println(e));
		
		
//		update
		StudentData st = session.get(StudentData.class,1);
		st.setAddress("Waki");
		st.setCollegeName("SKNSCOE");
		st.setEmail("prathamesh@gmail.com");
		st.setName("santu madhav");
		
		session.saveOrUpdate(st);
		System.out.println("data updated succesfully");

//		delete
		session.delete(st);
		trans.commit();
		System.out.println("data deleted succesfully");

		session.close();
		factory.close();
	}
}
