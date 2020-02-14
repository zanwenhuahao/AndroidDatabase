package com.example.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);

        List<User> users = MainActivity.connection.makeuserdao().getAllUsers();

        ArrayList<String> userData = new ArrayList<>();

        for(int i = 0 ; i<users.size(); i++){
            userData.add("User ID: " + users.get(i).getID() + "\nName: " + users.get(i).getFirstName() + ' '
            + users.get(i).getLastName());
        }

        ArrayAdapter<String> Useradapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, userData);
        ListView lv = (ListView) findViewById(R.id.UserList);
        lv.setAdapter(Useradapter);

    }
}
