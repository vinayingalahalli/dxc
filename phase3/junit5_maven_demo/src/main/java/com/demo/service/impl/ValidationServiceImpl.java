package com.demo.service.impl;

import com.demo.service.ValidationService;

public class ValidationServiceImpl implements ValidationService {

	public boolean isValidPan(String pan) {
		boolean b=false;
		if(pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			b=true;
		}
		return b;
	}

	public boolean isVaidPrimeNumber(int n) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}

}
