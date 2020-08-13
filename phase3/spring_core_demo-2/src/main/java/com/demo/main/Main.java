package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Player;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Player p1=(Player) context.getBean("p1");
		System.out.println(p1);
		Player p2=(Player) context.getBean("p2");
		System.out.println(p2);

	}

}
