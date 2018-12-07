package com.example.ngokhai.reminderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetCalendar();
        ShowCalendar();
        EditTask();
        CheckLocation();
        CompareLocation();
        ShowTaskForLocation();
    }
    public void AddTask(View v)
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));
    }

    private void GetCalendar()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

    private void ShowCalendar()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

    private void EditTask()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

    private void CheckLocation()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

    private void CompareLocation()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

    private void ShowTaskForLocation()
    {
        startActivity(new Intent(MainActivity.this, AddTask.class));

    }

}
