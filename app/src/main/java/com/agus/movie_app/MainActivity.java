package com.agus.movie_app;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavView = findViewById(R.id.bottomNavView);
        bottomNavView.setOnItemSelectedListener(this::onNavigationItemSelected);

        // Set default fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ActionFragment()).commit();
    }


    private boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment;

        int itemId = item.getItemId();
        if (itemId == R.id.actionItem) {
            selectedFragment = new ActionFragment();
        } else if (itemId == R.id.komediItem) {
            selectedFragment = new KomediFragment();
        } else if (itemId == R.id.romanceItem) {
            selectedFragment = new RomanceFragment();
        } else {
            throw new IllegalStateException("Unexpected value: " + itemId);
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
        return true;
    }

}
