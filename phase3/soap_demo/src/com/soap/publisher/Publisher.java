package com.soap.publisher;

import javax.xml.ws.Endpoint;

import com.soap.service.impl.CalculatorServiceImpl;

public class Publisher {

	public static void main(String[] args) {
		String url="http://localhost:9100/calci";
		Endpoint.publish(url, new CalculatorServiceImpl());
		
		System.out.println("Hello your service is published at "+url+"?wsdl");
		System.out.println("use the above wsdl url to consume in your client machine");
	}

}
