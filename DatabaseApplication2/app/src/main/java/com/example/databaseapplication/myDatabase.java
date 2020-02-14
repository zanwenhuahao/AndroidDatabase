package com.example.databaseapplication;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class myDatabase extends RoomDatabase {

    public abstract UserDAO makeuserdao();
}
