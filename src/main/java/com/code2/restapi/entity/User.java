package com.code2.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	
	@Column(name="user_name")
	public String username;
	
	@Column(name="password")
	public String password;
	
	@Column(name="country")
	public String country;
	
	@Column(name="native_language")
	public String nativeLanguage;
	
	@Column(name="learning_language")
	public String learningLanguage;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String username, String password, String country, String nativeLanguage,
			String learningLanguage) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.country = country;
		this.nativeLanguage = nativeLanguage;
		this.learningLanguage = learningLanguage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public String getLearningLanguage() {
		return learningLanguage;
	}

	public void setLearningLanguage(String learningLanguage) {
		this.learningLanguage = learningLanguage;
	}

}
