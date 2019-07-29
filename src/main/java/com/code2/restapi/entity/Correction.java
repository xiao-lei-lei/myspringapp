package com.code2.restapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="correction")
public class Correction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="text")
	private String text;
	
	@Column(name="user")
	private String user;
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE
			,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="post_id")
	private Post post;

	public Correction(Long id, String text, String user, Post post) {
		super();
		this.id = id;
		this.text = text;
		this.user = user;
		this.post = post;
	}
	
	public Correction() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
