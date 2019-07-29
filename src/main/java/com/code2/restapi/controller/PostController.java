package com.code2.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code2.restapi.entity.Correction;
import com.code2.restapi.entity.Post;
import com.code2.restapi.service.CorrectionService;
import com.code2.restapi.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@Autowired
	private CorrectionService correctionService;
	
	@Autowired
	private PostService postService;
	
	
	@GetMapping
	public List<Post> all (){
		return postService.findAll();
	}
	
	@PostMapping
	public String savePost(@RequestBody Post post) {
		postService.createPost(post);
		return "successfully saved";
	}
	
	@DeleteMapping("/{id}")
	public String deletePost(@PathVariable Long id) {
		postService.delete(id);
		return "delete successfully";
	}
	
	@GetMapping("/{id}")
	public Post getPost(@PathVariable Long id) {
		Post post = postService.getPost(id);
		System.out.println(post.getText());
		 return post;
	}
	
	@PutMapping("/{id}")
	public Post updatePost(@RequestBody Post post, @PathVariable Long id) {
		Post queryPost = postService.getPost(id);
		queryPost.setText(post.getText());
		queryPost.setLanguage(post.getLanguage());
		queryPost.setUser(post.getUser());
		Post p1 = postService.updatePost(queryPost);
		return p1;
	}

	@PostMapping("/{id}/correct")
	public void create(@PathVariable Long id ,@RequestBody Correction correct) {
		Post post = postService.getPost(id);
		
		correct.setPost(post);
		
		correctionService.create(correct);
	}
}
