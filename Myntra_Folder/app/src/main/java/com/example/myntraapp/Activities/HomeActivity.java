package com.example.myntraapp.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import com.example.myntraapp.NavFragments.CategoryFragment;
import com.example.myntraapp.NavFragments.ExploreFragment;
import com.example.myntraapp.NavFragments.HomeFragment;
import com.example.myntraapp.NavFragments.ProfileFragment;
import com.example.myntraapp.R;
import com.example.myntraapp.NavFragments.StudioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
                fragment = new StudioFragment();
                break;
            case R.id.explore:
                fragment = new ExploreFragment();
                break;
            case R.id.profile:
                fragment = new ProfileFragment();
                break;
        }
        if (fragment != null){
            loadFragment(fragment);
        }
        return true;
    }
}