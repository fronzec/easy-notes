package com.example.easynotes.repository;


// Java Core Imports

// Thirth Party Libraries Import
import org.springframework.data.jpa.repository.JpaRepository;

// Application Imports
import com.example.easynotes.models.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
