package com.example.abdillahhanif.exercisemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item)
    { if (item.getItemId()==R.id.inset) {

        startActivity(new Intent(this, InsertActivity.class));

    } else if (item.getItemId() == R.id.edit) {
        startActivity(new Intent(this, EditActivity.class));
    }

        return true;
    }

}
