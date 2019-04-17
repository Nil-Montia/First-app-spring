package com.qa.Controller;

import com.qa.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class NotesController {
    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> list(){
        return NotesStub.list();
    }
    @RequestMapping(value = "notes", method = RequestMethod.POST)
    public Note create(@RequestBody Note note){
        return NotesStub.create(note);
    }
    @RequestMapping(value = "notes/{id}", method = RequestMethod.POST)
    public Note get(@PathVariable Long id){
        return NotesStub.get(id);
    }
    @RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
    public Note update(@PathVariable Long id, @RequestBody Note note){
        return NotesStub.update(id, note);
    }
    @RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
    public Note delete(@PathVariable Long id){
        return NotesStub.delete(id);
    }



}

