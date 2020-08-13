package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.HelloScope;

public class ScopesMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("scopebean.xml");
		System.out.println("\nAccessing h2(id)");
		HelloScope h2=(HelloScope) context.getBean("h2");
		System.out.println(h2.getMessage());
		System.out.println("hashcode of h2 "+h2.hashCode());
		
		System.out.println("\nAccessing h2(id) again");
		HelloScope h22=(HelloScope) context.getBean("h2");
		System.out.println(h22.getMessage());
		System.out.println("hashcode of h22 "+h22.hashCode());
		
		System.out.println("\nAccessing h1(id)");
		HelloScope h1=(HelloScope) context.getBean("h1");
		System.out.println(h1.getMessage());
		System.out.println("hashcode of h1 "+h1.hashCode());
		
		System.out.println("\nAccessing h1(id) again");
		HelloScope h11=(HelloScope) context.getBean("h1");
		System.out.println(h11.getMessage());
		System.out.println("hashcode of h11 "+h11.hashCode());
		

	}

}
