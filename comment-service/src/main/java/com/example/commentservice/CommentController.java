package com.example.commentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentservice.model.Comments;
import com.example.commentservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@Value("${server.port}")
	String port;
	
	@GetMapping("/port")
	public String getPort() {
		return "comment-service is running on port-->"+port;
		
	}
	
	@GetMapping("/postid/{pid}")
	public List<Comments> getCommentsByPostId(@PathVariable int pid){
		return service.getCommentsByPostId(pid);
	}
	
	@PostMapping("/create")
	public Comments addComment(@RequestBody Comments comment)
	{
		return service.createComment(comment);
	}
	@GetMapping("/display")
	public List<Comments> showAllComments(){
		return service.getAllComments();
	}

}
