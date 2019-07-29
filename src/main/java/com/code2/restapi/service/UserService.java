package com.code2.restapi.service;

import java.util.List;

import com.code2.restapi.entity.User;

public interface UserService {

	void create(User user);

	List<User> findAll();

	void delete(Long id);

	User getById(Long id);

	User update(User u1);


	
}
