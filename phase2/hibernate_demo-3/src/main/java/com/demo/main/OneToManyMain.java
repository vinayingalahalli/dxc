package com.demo.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Answer;
import com.demo.model.Question;

public class OneToManyMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Answer a1=new Answer("bijarane stroustroup", "saikrishna");
//		Answer a2=new Answer("saurav gangul", "yashwanth");
//		Answer a3=new Answer("dennis ritchie", "abhishek");
//	
//		List<Answer> aList1=new ArrayList<>();
//		aList1.add(a1);
//		aList1.add(a2);
//		aList1.add(a3);
//		Question q1=new Question("Who is father of C?", aList1); 
//		a1.setQuestion(q1);
//		a2.setQuestion(q1);
//		a3.setQuestion(q1);
//	
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(q1);
//		
		
		Query query=session.createQuery("from com.demo.model.Question");
		
		List<Question> qlist=query.list();
		for(Question q:qlist) {
			System.out.println(q.getQuestion());
			for(Answer a:q.getAnswerList()) {
				System.out.println("answer given -> "+a.getAnswer()+" answeredby = "+a.getAnsweredBy());
			}
		}
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
