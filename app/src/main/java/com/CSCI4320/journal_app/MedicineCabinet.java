package com.CSCI4320.journal_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MedicineCabinet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_cabinet);
        Toolbar toolbar = findViewById(R.id.mc_action_bar);
        setSupportActionBar(toolbar);
    }

    // Cameron added this
    // puts the 3 dot menu onto the activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater(); // create the menu object
        inflater.inflate(R.menu.menu, menu); // places the menu object on the Action Bar
        return super.onCreateOptionsMenu(menu);
    }

    // Cameron added this
    // handles selection of menu items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.journals:
                Toast.makeText(getApplicationContext(), "Journals", Toast.LENGTH_SHORT).show();
                //Intent journals = new Intent(this, Journals.class);
                //startActivity(journals);
                break;
            case R.id.devices:
                Toast.makeText(getApplicationContext(), "Devices", Toast.LENGTH_SHORT).show();
                Intent devices = new Intent(this, Devices.class);
                startActivity(devices);
                break;
            case R.id.settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                //Intent settings = new Intent(this, SettingsReal.class);
                //startActivity(settings);
                break;
            case R.id.profile:
                Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.log_out:
                Toast.makeText(getApplicationContext(), "Log Out", Toast.LENGTH_SHORT).show();
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}
