package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Player;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Player p1=new Player(102, "virat");
//		Player p2=new Player(101, "Saurav");
//		session.save(p1);
//		session.save(p2);
		
//		Player p1=(Player) session.get(Player.class, 101);
//		System.out.println(p1);
		
//		Player p2=new Player(101, "Saurav Ganguly");
//		session.update(p2);
//		
//		Player p=new Player();
//		p.setId(102);
//		session.delete(p);
//		
		
//		Player p1=new Player("Sachin",1234);
//		Player p2=new Player("Saurav",1111);
//		Player p3=new Player("Virat",1233);
//		Player p4=new Player("Chris",2333);
//		Player p5=new Player("Ab De",6666);
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
//		session.save(p5);
//		
		//System.out.println(session.get(Player.class, 3));
		
		transaction.commit();
		session.close();
		
		factory.close();

	}

}
