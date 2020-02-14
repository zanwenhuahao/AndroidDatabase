package com.example.databaseapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface UserDAO {
    //Add user (Insert into database)
    @Insert
    public void addUser(User user);

    //Delete from database

    @Delete
    public void deleteUser(User user);

    @Query("SELECT * FROM users")
    public List<User> getAllUsers();

    @Query("Select username, password from users where username = :u and passowrd = :p")
    //Verify that the user is an existing user logging in.
    public List<User> authenticate(String u, String p);
}
