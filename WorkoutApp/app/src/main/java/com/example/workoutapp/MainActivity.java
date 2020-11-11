package com.example.workoutapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.workoutapp.area.Client.chucNang.Excercise.FragmentClientExercise;
import com.example.workoutapp.area.Client.chucNang.PersonalInformation.FragmentClientBodyInfo;
import com.example.workoutapp.area.Client.chucNang.PersonalInformation.FragmentClientPersonalInformation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemReselectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FragmentClientExercise()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemReselectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_exercise:
                            selectedFragment = new FragmentClientBodyInfo();
                            break;

                        case R.id.nav_personal_information:
                            selectedFragment = new FragmentClientPersonalInformation();
                            break;

                        case R.id.nav_nutries:
                            selectedFragment = new FragmentClientExercise();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            };

}