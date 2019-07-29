package com.code2.restapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.restapi.entity.Post;
import com.code2.restapi.repository.PostRepository;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	@Transactional
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		postRepository.save(post);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
	}

	

	@Override
	@Transactional
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	@Transactional
	public Post getPost(Long id) {
		// TODO Auto-generated method stub
		Optional<Post> post= postRepository.findById(id);
		return post.get();
	}

	@Override
	@Transactional
	public Post updatePost(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

}
