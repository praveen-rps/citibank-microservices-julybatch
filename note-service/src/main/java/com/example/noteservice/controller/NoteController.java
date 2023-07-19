package com.example.noteservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.noteservice.model.CommentDto;
import com.example.noteservice.model.Notes;
import com.example.noteservice.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@GetMapping("/commentsPort")
	public String getCommentsPort() {
		return service.getCPort();
	}
	
	@GetMapping("/comments/{pid}")
	public List<CommentDto> getAllCommentsForPid(@PathVariable int pid){
		return service.viewComments(pid);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String removePost(@PathVariable int pid) {
		return service.deleteNotes(pid);
	}
	
	@GetMapping("/display")
	public List<Notes> displayAllNotes(){
		return service.viewAllNotes();
	}
	
	@PostMapping("/create")
	public Notes addPost(@RequestBody Notes note){
		return service.createNotes(note);
	}
	
	@GetMapping("/search/{title}")
	public List<Notes> searchNotesByTitle(@PathVariable String title){
		return service.searchByTitle(title);
	}

}
