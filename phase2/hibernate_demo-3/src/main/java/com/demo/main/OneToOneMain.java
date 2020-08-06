package com.demo.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Addresss;
import com.demo.model.Employee;

public class OneToOneMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//		
//		Addresss a1=new Addresss("xyz street", "Mumbai", 70000);
//		Addresss a2=new Addresss("abc street", "Chennai", 60000);	
//		
//		Employee e1=new Employee("Mahesh", a1);
//		Employee e2=new Employee("Suresh", a2);
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(e1);
//		session.save(e2);
//		
	//	System.out.println(session.get(Employee.class, 2));
		
		Query query=session.createQuery("from com.demo.model.Employee");
		List<Employee> empList=query.list();
		for(Employee e:empList) {
			System.out.println(e.getName());
			if(e.getName().equals("Suresh")) {
				System.out.println("getting address of "+e.getName());
				System.out.println(e.getAddresss());
			}
		}
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
