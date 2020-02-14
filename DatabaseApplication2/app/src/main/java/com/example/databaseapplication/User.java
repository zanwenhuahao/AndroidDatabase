package com.example.databaseapplication;

import androidx.room.ColumnInfo;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;

@Entity (tableName = "users")
public class User
{

    @PrimaryKey
    @ColumnInfo (name ="user_ID") //Optional, tell complier you are overriding the name with "user_ID"

    private int ID;
    private String firstName;
    private String lastName;
    private String email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
