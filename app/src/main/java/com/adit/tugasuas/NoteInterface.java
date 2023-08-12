package com.adit.tugasuas;
//Ihsan Ramadhan Nul Hakim 10120143 IF-4
import android.database.Cursor;

import com.adit.tugasuas.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);

}
