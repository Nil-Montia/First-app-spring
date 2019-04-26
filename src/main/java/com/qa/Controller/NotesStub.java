package com.qa.Controller;

import com.qa.model.Note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesStub {
    private static Map<Long, Note> notes= new HashMap<Long, Note>();

    private static Long idIndex = 3L;

    static{
        Note note1= new Note(
                1L,
                "Golf",
                "A very deep German car"

        );
        Note note2= new Note(
                2L,
                "Astra",
                "Decent car"

        );
        Note note3= new Note(
                3L,
                "Focus",
                "Like new"

        );
        notes.put(1L, note1);
        notes.put(2L, note2);
        notes.put(3L, note3);
    }

    public static List<Note> list(){
        return new ArrayList<Note>(notes.values());
    }

    public static Note create(Note note){
        idIndex += 1;
        note.setId(idIndex);
        notes.put(idIndex, note);
        return note;
    }

    public static Note get(Long id){
        return notes.get(id);
    }

    public static Note update (Long id, Note note){
        note.setId(id);
        notes.put(id, note);
        return note;
    }

    public static Note delete(Long id){
        return notes.remove(id);
    }
}
