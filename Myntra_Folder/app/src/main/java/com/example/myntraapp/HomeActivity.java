package com.example.myntraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myntraapp.NavFragments.CategoryFragment;
import com.example.myntraapp.NavFragments.ExploreFragment;
import com.example.myntraapp.NavFragments.HomeFragment;
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
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.categories:
                fragment = new CategoryFragment();
                break;
            case R.id.studio:
                fragment = new com.example.myntraapp.StudioFragment();
                break;
            case R.id.explore:
                fragment = new ExploreFragment();
                break;
            case R.id.profile:
                fragment = new com.example.myntraapp.ProfileFragment();
                break;
        }
        if (fragment != null){
            loadFragment(fragment);
        }
        return true;
    }
}