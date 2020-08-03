package com.login.service.impl;

import com.login.dao.impl.LoginDAOImpl;
import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.LoginService;

public class LoginServiceImpl implements LoginService {

	
	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b = false;
		if (user != null && user.getUsername().matches("[a-z]{4,6}[0-9]{3}")
				&& user.getPassword().matches("[a-z]{4,8}@[0-9a-z]{4,7}")) {
			//code here for DAO
			b=new LoginDAOImpl().isValidUserCredentials(user);
		}else {
			throw new BusinessException("Invalid UserName/Password");
		}

		return b;
	}

}
