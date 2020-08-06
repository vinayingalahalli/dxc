package com.demo.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.demo.model.Player;

public class HQLMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		session.save(new Player("Sachin", "Mumbai", 40));
//		session.save(new Player("Chris Gayle", "Trinidad", 42));
//		session.save(new Player("Ab De Villiers", "Bangalore", 38));
//		session.save(new Player("Virat", "Delhi", 32));
//		session.save(new Player("Rohit", "Mumbai", 32));
		
		Query query=session.createQuery("from com.demo.model.Player where city=:city");
		query.setString("city", "Mumbai");
		//With query API try update and delete from different column apart from PK
		List<Player> playerList=query.list();
		System.out.println("With HQL");
		for(Player p:playerList) {
			System.out.println(p);
		}
		
		
		Criteria criteria=session.createCriteria(Player.class);
		criteria.add(Restrictions.eq("city", "Mumbai"));
		criteria.add(Restrictions.gt("age", 32));
		List<Player> players=criteria.list();
		System.out.println("With HCQL(Criteria)");
		for(Player p:players) {
			System.out.println(p);
		}
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
