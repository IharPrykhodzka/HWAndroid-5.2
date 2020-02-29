package com.example.hwandroid52;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, R.string.txtOpenNote, Toast.LENGTH_LONG).show();

            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

            return true;

        } else if (id == R.id.action_open_address){
            Toast.makeText(MainActivity.this, R.string.txtOpenAddress, Toast.LENGTH_LONG).show();

            Intent intentAddress = new Intent(MainActivity.this, AddressActivity.class);
            startActivity(intentAddress);

            return true;

        }else if (id == R.id.action_open_calendsr){
            Toast.makeText(MainActivity.this, R.string.txtOpenCalendar, Toast.LENGTH_LONG).show();

            Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentCalendar);

            return true;

        }else if (id == R.id.action_settings){
            Toast.makeText(MainActivity.this, R.string.txtOpenSettings, Toast.LENGTH_LONG).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
