package com.example.commentservice.service;

import java.util.List;

import com.example.commentservice.model.Comments;

public interface CommentService {
	
	public List<Comments> getAllComments();
	public List<Comments> getCommentsByPostId(int pid);
	public Comments createComment(Comments comment);
}
