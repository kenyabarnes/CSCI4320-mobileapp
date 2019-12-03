package com.CSCI4320.journal_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Devices extends AppCompatActivity {

    ListView listview;
    Button Addbutton;
    EditText GetValue;

    Button hm_button;
    Button gl_button;
    Button mc_button;
    Button bp_button;

    //SharedPreferences prefs;
    //private String devi_prefs;
    //private String pref_key;
    //private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);
        Toolbar toolbar = findViewById(R.id.devices_action_bar);
        setSupportActionBar(toolbar);

        listview = (ListView) findViewById(R.id.devices_listview);
        Addbutton = (Button) findViewById(R.id.devices_addbutton);
        GetValue = (EditText)findViewById(R.id.devices_edittext);
        hm_button = (Button) findViewById(R.id.devices_hm_button);
        gl_button = (Button) findViewById(R.id.devices_gl_button);
        mc_button = (Button) findViewById(R.id.devices_mc_button);
        bp_button = (Button) findViewById(R.id.devices_bp_button);

        hm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Devices.this,HeartMonitor.class));
            }
        });

        //prefs = getSharedPreferences(devi_prefs, Context.MODE_PRIVATE);

        final List<String> list_elements_arraylist = new ArrayList<String>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_elements_arraylist);

        listview.setAdapter(adapter);

        /*list_elements_arraylist.add("Heart Monitor");
        list_elements_arraylist.add("Cabinet");
        list_elements_arraylist.add("Glucose Levels");
        list_elements_arraylist.add("Blood Pressure");
        adapter.notifyDataSetChanged();*/

        Addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String device = GetValue.getText().toString();
                list_elements_arraylist.add(device);
                adapter.notifyDataSetChanged();
                //counter++;
            }
        });

        /*listview.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){

            }
        });*/

        /*listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "OOPS"+position, Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(view.getContext(), HeartMonitor.class);
                    startActivity(myIntent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "OOPS"+position, Toast.LENGTH_SHORT).show();
                    Intent myIntent = new Intent(view.getContext(), HeartMonitor.class);
                    startActivity(myIntent);
                }


                *//*if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }*//*
            }
        });*/

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
