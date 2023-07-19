package com.example.noteservice.service;

import java.util.List;
import java.util.Optional;

import com.example.noteservice.model.CommentDto;
import com.example.noteservice.model.Notes;

public interface NoteService {
	
	public String getCPort();
	public Notes createNotes(Notes note);
	public Optional<Notes> searchNotes(int pid);
	public String deleteNotes(int pid);
	public List<CommentDto> viewComments(int pid);
	public List<Notes> viewAllNotes();
	public List<Notes> searchByTitle(String title);

}
