package com.derian.cursionadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        setContentView(R.layout.activity_main);

        List<User> items = new ArrayList<>();

        items.add(new User( "1Derian Agramonte", "C / Primera #2"));
        items.add(new User( "2Derian Agramonte", "C / Primera #2"));
        items.add(new User( "3Derian Agramonte", "C / Primera #2"));
        items.add(new User( "4Derian Agramonte", "C / Primera #2"));
        items.add(new User( "5Derian Agramonte", "C / Primera #2"));
        items.add(new User( "6Derian Agramonte", "C / Primera #2"));

        // instantiate the adapter
        UserAdapter adapter = new UserAdapter(this , items);

        ListView myList = findViewById(R.id.listView);
        myList.setAdapter(adapter);

        //ListView.OnItemClickListener()



    }
}
