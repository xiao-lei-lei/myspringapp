package com.code2.restapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.restapi.entity.User;
import com.code2.restapi.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public void create(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	@Transactional
	public User getById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	@Override
	public User update(User u1) {
		// TODO Auto-generated method stub
		return userRepository.save(u1);
	}	
	
}
