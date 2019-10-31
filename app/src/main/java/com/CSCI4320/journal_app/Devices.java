package com.CSCI4320.journal_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Devices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);
        /*Toolbar toolbar = findViewById(R.id.devi_acti_bar);
        setSupportActionBar(toolbar);*/
    }

    // Custom action bar to be added in next push
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.journals:
                Toast.makeText(getApplicationContext(), "Journals", Toast.LENGTH_SHORT).show();
                break;
            case R.id.devices:
                Toast.makeText(getApplicationContext(), "Devices", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                //Intent settings = new Intent(this, SettingsActivity2.class);
                //startActivity(settings);
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }*/

}
