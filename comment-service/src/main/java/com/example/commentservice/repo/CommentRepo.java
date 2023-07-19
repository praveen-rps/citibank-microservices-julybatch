package com.example.commentservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.commentservice.model.Comments;

public interface CommentRepo extends JpaRepository<Comments,Integer> {
	
	public List<Comments> findByPid(int pid);

}
