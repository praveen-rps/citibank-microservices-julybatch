package com.example.noteservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.noteservice.model.CommentDto;

@FeignClient(name="COMMENT-SERVICE")
public interface FeignProxy {
	
	@GetMapping("comments/port")
	public String getPort();
	
	@GetMapping("comments/postid/{pid}")
	public List<CommentDto> getCommentsByPostId(@PathVariable int pid);
	

}
