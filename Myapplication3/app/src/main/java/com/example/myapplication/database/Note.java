package com.example.myapplication.database;

public class Note {
    private String title;
    private String noteText;
    private int id;

    public Note(String title, String noteText, int id) {
        this.title = title;
        this.noteText = noteText;
        this.id = id;
    }

    public Note(String title, String noteText) {
        this.title = title;
        this.noteText = noteText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
