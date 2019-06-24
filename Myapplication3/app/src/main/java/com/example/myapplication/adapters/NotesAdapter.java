package com.example.myapplication.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.myapplication.database.Note;

import java.util.List;

public class NotesAdapter extends ArrayAdapter<Note>{
    public NotesAdapter(Context context, int resource, List<Note> objects) {
        super(context, resource, objects);
    }
}
