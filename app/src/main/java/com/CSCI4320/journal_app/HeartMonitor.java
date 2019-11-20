package com.CSCI4320.journal_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class HeartMonitor extends AppCompatActivity {

    TextView textview = (TextView)findViewById(R.id.hm_textview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_monitor);
        Toolbar toolbar = findViewById(R.id.hm_action_bar);
        setSupportActionBar(toolbar);
        /*try {
            pulse();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
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

    /*public void pulse() throws InterruptedException {
        for(int i=0; i<10; i++){
            textview.setText("Test" + i);
            TimeUnit.SECONDS.sleep(1);
        }
    }*/

}
