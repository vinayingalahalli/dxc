package com.demo.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Hello;

public class LifeCycleMain {

	public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecyclebeans.xml");
	Hello h1=(Hello) context.getBean("h1");
	System.out.println(h1.getMessage());
	Hello h2=(Hello) context.getBean("h2");
	System.out.println(h2.getMessage());
	context.registerShutdownHook();
	context.close();
	

	}

}
