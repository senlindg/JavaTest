package com.demo.ejb.service;

import javax.ejb.Remote;

import com.demo.ejb.beans.User;

@Remote
public interface UserService {
	public boolean login(String username,String password);
	public boolean isExist(String username);
	public Integer register(User record);
}
