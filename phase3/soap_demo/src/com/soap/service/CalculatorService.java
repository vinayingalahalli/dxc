package com.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorService {

	@WebMethod
	public String sayHello();
	@WebMethod
	public String sayHelloByName(String name);
	@WebMethod
	public int add(int a,int b);
	@WebMethod
	public int multiply(int a,int b);
}
