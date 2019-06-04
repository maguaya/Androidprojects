package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNoteactivity extends AppCompatActivity {
    EditText etTitle;
    EditText etNote;
    Button btnAddPhoto;
    Button btnAddVoiceNote;
    Button btnAddVoiceNote;
    Button btnSave;
    String note;
    String tittle;

    @Override
    protected void =

    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_noteactivity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        etTitle = findViewById(R.id.etTitle);
        etNote = findViewById(R.id.etNote);
        btnAddPhoto = findViewById(R.id.bnAddVoiceNote);
        btnAddVoiceNote = findViewById(R.id.bnAddVoiceNote);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener((v) {
                tittle = etTitle.getText().toString();
        note = etNote.getText().toString();


        });
    }
}



}
