package com.example.ngokhai.reminderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LocationPicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        GetLocation();
        ConvertLocation();
    }

    public void PickLocation(View v)
    {
        startActivity(new Intent(LocationPicker.this, AddTask.class));
    }

    private void GetLocation()
    {
        startActivity(new Intent(LocationPicker.this, AddTask.class));
    }

    private void ConvertLocation()
    {
        startActivity(new Intent(LocationPicker.this, AddTask.class));
    }

}
