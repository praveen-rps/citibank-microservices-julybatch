package com.example.noteservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noteservice.model.Notes;

public interface NoteRepository extends JpaRepository<Notes,Integer>{
	public List<Notes> findByTitle(String title);
}
