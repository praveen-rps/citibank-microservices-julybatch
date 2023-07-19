package com.example.noteservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.noteservice.model.CommentDto;
import com.example.noteservice.model.Notes;
import com.example.noteservice.repo.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	NoteRepository repo;
	
	@Autowired
	FeignProxy proxy;

	@Autowired
	RestTemplate template;

	@Override
	public Notes createNotes(Notes note) {
		// TODO Auto-generated method stub
		return repo.save(note);
	}

	@Override
	public Optional<Notes> searchNotes(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid);
	}

	@Override
	public String deleteNotes(int pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
		return "note delted";
	}

	@Override
	public List<Notes> viewAllNotes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Notes> searchByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<CommentDto> viewComments(int pid) {
		// TODO Auto-generated method stub
		//return template.getForObject("http://COMMENT-SERVICE/comments/postid/"+pid,List.class);
		return proxy.getCommentsByPostId(pid); 
	}

	@Override
	public String getCPort() {
		return proxy.getPort();
				
		// TODO Auto-generated method stub
		//return template.getForObject("http://COMMENT-SERVICE/comments/port",String.class);
	}

}
