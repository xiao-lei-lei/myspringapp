package com.code2.restapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="text")
	private String text;
	
	@Column(name="language")
	private String language;
	
	@Column(name="user")
	private String user;
	
	@OneToMany(mappedBy="post", cascade= {CascadeType.DETACH,CascadeType.MERGE
		    ,CascadeType.PERSIST,CascadeType.REFRESH})

	private List<Correction> correctionList;

	public Post(long id, String text, String language, String user) {
		super();
		this.id = id;
		this.text = text;
		this.language = language;
		this.user = user;
	}
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public List<Correction> getCorrectionList() {
		return correctionList;
	}

	public void setCorrectionList(List<Correction> correctionList) {
		this.correctionList = correctionList;
	}

	public void add(Correction tempCorrect) {
		if(correctionList==null) {
			correctionList=new ArrayList<>();
		}
		correctionList.add(tempCorrect);
		tempCorrect.setPost(this);
	}
	
}
