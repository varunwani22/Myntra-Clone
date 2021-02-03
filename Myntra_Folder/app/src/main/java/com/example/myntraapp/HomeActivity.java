package com.example.myntraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView tvBottomNav = (BottomNavigationView)findViewById(R.id.bottomNavigation);
        tvBottomNav.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());

    }

    private void loadFragment(Fragment fragment) {

        getSupportFragmentManager().beginTransaction().replace(R.id.relativeLayout,fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.dashboard:
                fragment = new HomeFragment();
                break;
            case R.id.users:
                fragment = new CategoryFragment();
                break;
            case R.id.profile:
                fragment = new StudioFragment();
                break;
            case R.id.fourth:
                fragment = new ExploreFragment();
                break;
            case R.id.fifth:
                fragment = new ProfileFragment();
                break;
        }
        if (fragment != null){
            loadFragment(fragment);
        }
        return true;
    }
}