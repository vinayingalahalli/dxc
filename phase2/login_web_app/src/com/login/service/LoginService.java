package com.login.service;

import com.login.exception.BusinessException;
import com.login.model.User;

public interface LoginService {

	public boolean isValidUserCredentials(User user)throws BusinessException;
}
