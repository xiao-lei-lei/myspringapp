package com.code2.restapi.service;

import java.util.List;

import com.code2.restapi.entity.Post;


public interface PostService {

	void createPost(Post post);

	void delete(Long id);

	List<Post> findAll();

	Post getPost(Long id);

	Post updatePost(Post post);

	

}
