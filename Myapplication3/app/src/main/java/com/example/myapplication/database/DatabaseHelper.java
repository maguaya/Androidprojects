package com.example.myapplication.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("CREATE TABLE notes(id INTEGER PRIMARY KEY AUTOINCREMENT,title Text ,noteText TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long addNote(Note note){
        SQLiteDatabase sqLiteDatabase=this .getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("tittle",note.getTitle());
        contentValues.put("noteText",note.getNoteText());
        long insert =sqLiteDatabase.insert("Note",null,contentValues);
        return insert;
    }
public List<Note> getNote(){
        List<Note>noteList=new ArrayList<Note>();
        String query="SELECT* from notes ";
        SQLiteDatabase sqLiteDatabase =this .getReadableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(query,null);
        if (cursor.moveToFirst()==true){

            do{
              Note note=new Note();
              note.setId(cursor.getInt(cursor.getColumnIndex("id")));
              note.setTitle(cursor.getString(cursor.getColumnIndexOrThrow("title")));
              note.setNoteText(cursor.getString(cursor.getColumnIndex("noteTEXT")));
              noteList.add(note);
          }
          while (cursor.moveToNext()==true);

          }
         sqLiteDatabase.close();
        return noteList;
         }

}

