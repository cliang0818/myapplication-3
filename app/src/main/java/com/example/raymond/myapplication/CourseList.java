package com.example.raymond.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseList extends AppCompatActivity {

    private static final String TAG_COURSELIST = "list output";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        //Creating the arraylist
        ArrayList<modules> arrayOfModules = new ArrayList<modules>();
        modulesAdapter adapter = new modulesAdapter(this, arrayOfModules);
        ListView listview = findViewById(R.id.listview);
        listview.setAdapter(adapter);
        Log.e(TAG_COURSELIST, "Adapter initialized");
        //Declaring the different modules to be shown in the list view
        modules usecases = new modules("Use Cases", "Introduction to Use Cases");
        modules designthinking = new modules("Design Thinking", "Introduction to Design Thinking");
        modules agilescrum = new modules("Agile Scrum", "Introduction to Agile Scrum");
        adapter.add(usecases);
        adapter.add(designthinking);
        adapter.add(agilescrum);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            //Using the position of items on the list to use intents in order to go to the activity
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(), usecases.class);
                    startActivityForResult(myintent, 0);
                    Log.e(TAG_COURSELIST, "UseCases Class Called");
                }
                if(position==1){
                    Intent myintent = new Intent(view.getContext(), designthinking.class);
                    startActivityForResult(myintent, 0);
                    Log.e(TAG_COURSELIST, "Design Thinking Class Called");
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(), agilescrum.class);
                    startActivityForResult(myintent, 0);
                    Log.e(TAG_COURSELIST, "Agile Scrum Class Called");
                }
            }

        });
    }
}
