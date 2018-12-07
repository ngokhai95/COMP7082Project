package com.example.ngokhai.reminderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class AddTask extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Switch locationSwitch = findViewById(R.id.switchLocation);

        locationSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked)
            {
                ChooseLocation();
            }
        }
    });

        Switch alertSwitch = findViewById(R.id.switchAlert);

        alertSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    SetAlert();
                }
            }
        });
        PushCalendar();
    }

    private void ChooseLocation()
    {
        startActivity(new Intent(AddTask.this, LocationPicker.class));
    }

    private void SetAlert()
    {
        startActivity(new Intent(AddTask.this, SetAlarm.class));
    }

    private void PushCalendar()
    {
        startActivity(new Intent(AddTask.this, SetAlarm.class));

    }

    public void Save(View v)
    {
        startActivity(new Intent(AddTask.this, MainActivity.class));
    }

}
