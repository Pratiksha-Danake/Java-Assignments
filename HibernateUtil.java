package com.crud.operation.CrudOperations;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	public static SessionFactory session;

	public static SessionFactory getSessionFactory() {

		Configuration conf = new Configuration();
		Properties properties = new Properties();

		if (session == null) {
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/myhiber");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "debu@2003");
			properties.put(Environment.SHOW_SQL, "true");
			properties.put(Environment.FORMAT_SQL, "true");
			properties.put(Environment.HBM2DDL_AUTO, "update");
//			properties.put(Environment.DIALECT, "org.hibernate.MySQL8Dialect");

			conf.setProperties(properties);
			conf.addAnnotatedClass(StudentData.class);

			ServiceRegistry registry = (ServiceRegistry) new StandardServiceRegistryBuilder()
					.applySettings(conf.getProperties()).build();
			session = conf.buildSessionFactory((org.hibernate.service.ServiceRegistry) registry);
		}
		return session;
	}

}
