package com.example.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static myDatabase connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connection = Room.databaseBuilder(getApplicationContext(), myDatabase.class, "users").allowMainThreadQueries().build();

    }

    public void adduserPressed(View view) {
    }

    public void viewuserPressed(View view) {
    }

    public void deleteuserPressed(View view) {
    }

    public void edituserPressed(View view) {
    }
}
