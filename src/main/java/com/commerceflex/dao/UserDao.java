package com.commerceflex.dao;

import java.util.List;

import com.commerceflex.entity.User;


public interface UserDao {
	void add(User user);
	List<User> listUsers();

}
