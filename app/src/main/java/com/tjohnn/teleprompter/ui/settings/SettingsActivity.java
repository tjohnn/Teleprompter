package com.tjohnn.teleprompter.ui.settings;

import android.os.Bundle;
import android.view.MenuItem;

import com.tjohnn.teleprompter.R;
import com.tjohnn.teleprompter.daggerjetifier.DaggerAppCompatActivityX;

public class SettingsActivity extends DaggerAppCompatActivityX {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
