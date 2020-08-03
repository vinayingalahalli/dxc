package com.login.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbutil.MySqlDbConnection;
import com.login.dao.LoginDAO;
import com.login.exception.BusinessException;
import com.login.model.User;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean isValidUserCredentials(User user) throws BusinessException {
		boolean b = false;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select username from login_master where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Username/Password......");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact SYSADMIN "+e);
		}
		
		return b;
	}

}
