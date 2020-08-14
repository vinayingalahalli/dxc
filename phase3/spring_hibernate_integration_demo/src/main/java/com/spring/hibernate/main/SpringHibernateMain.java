package com.spring.hibernate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.dao.PlayerDAO;
import com.spring.hibernate.model.Player;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_orm_beans.xml");
		PlayerDAO dao=(PlayerDAO) context.getBean("dao");
		//System.out.println(dao.createPlayer(new Player("Rahul Dravid", 40, "Banaglore")));

		System.out.println("Printing Player By id");
		System.out.println(dao.getPlayerById(3));
		
		System.out.println("\nPrinting all the players");
		List<Player> playersList=dao.getAllPlayers();
		for(Player p:playersList) {
			System.out.println(p);
		}
		
	}

}
