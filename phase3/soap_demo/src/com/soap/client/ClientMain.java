package com.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soap.service.CalculatorService;

public class ClientMain {

	public static void main(String[] args) {
		String endpoint="http://localhost:9100/calci?wsdl";
		
		try {
			URL url=new URL(endpoint);
			//param1 of QName is the xmlns:tns(targetnamespace) from the wsdl file
			//param 2 is the name of the service from the wsdl file
			QName qname=new QName("http://impl.service.soap.com/", "CalculatorServiceImplService");
			Service service=Service.create(url,qname);
			CalculatorService cs=service.getPort(CalculatorService.class);
			System.out.println(cs.sayHello());
			System.out.println(cs.sayHelloByName("RAGHAV"));
			System.out.println("Add Service "+cs.add(100, 200));
			System.out.println("Multiply Service "+cs.multiply(100, 200));
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
		
	}

}
