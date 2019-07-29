package com.code2.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code2.restapi.entity.User;
import com.code2.restapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public User create(@RequestBody User user) {
		userService.create(user);
		return user;
	}
	
	@GetMapping("/list")
	public List<User> all(){
		return userService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		userService.delete(id);
		return "successfully delete";
	}
	
	@GetMapping("/list/{id}")
	public User get(@PathVariable Long id) {
		User user = userService.getById(id);
		return user;
	}
	
	@PutMapping("/list/{id}")
	public User update(@RequestBody User user, @PathVariable Long id) {
		User u1 = userService.getById(id);
		u1.setUsername(user.getUsername());
		u1.setPassword(user.getPassword());
		u1.setCountry(user.getCountry());
		u1.setNativeLanguage(user.getNativeLanguage());
		u1.setLearningLanguage(user.getLearningLanguage());
		return userService.update(u1);
	}

}
