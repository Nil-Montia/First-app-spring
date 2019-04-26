package com.qa.Repository;

import com.qa.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long>{

}
