package com.example.myntraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.myntraapp.NavFragments.CategoryFragment;
import com.example.myntraapp.NavFragments.ExploreFragment;
import com.example.myntraapp.NavFragments.HomeFragment;
import com.example.myntraapp.NavFragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ImageButton profileButton;
    View headerView;
    Intent intentLogin;
    Intent intentWeb;
    FragmentManager fragmentManager;
    TextView mTvLoginInHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fragmentManager = getSupportFragmentManager();
        PreferenceHelper.getSharedPreferences(this);
        BottomNavigationView tvBottomNav = (BottomNavigationView)findViewById(R.id.bottomNavigation);
        tvBottomNav.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        navigationView = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawableLayout);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        headerView = navigationView.getHeaderView(0);
        profileButton = headerView.findViewById(R.id.profileImageBtn);
        mTvLoginInHeader = headerView.findViewById(R.id.tvLoginInHeader);
        if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
            mTvLoginInHeader.setText("Log In  .  Sign Up");
        }else {
            mTvLoginInHeader.setText(PreferenceHelper.getStringFromPreference(LoginPageActivity.PREF_NAME_KEY));
        }


        mTvLoginInHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
                    intentLogin = new Intent(HomeActivity.this,LoginPageActivity.class);
                    startActivity(intentLogin);
                }else {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    ProfileFragment profileFragment = new com.example.myntraapp.NavFragments.ProfileFragment();
                    fragmentTransaction.add(R.id.relativeLayout,profileFragment,"profileFragment").addToBackStack("profileFragment").commit();
                }

            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
                    intentLogin = new Intent(HomeActivity.this,LoginPageActivity.class);
                    startActivity(intentLogin);
                }else {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    ProfileFragment profileFragment = new com.example.myntraapp.NavFragments.ProfileFragment();
                    fragmentTransaction.add(R.id.relativeLayout,profileFragment,"profileFragment").addToBackStack("profileFragment").commit();
                }
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId()){
                    case R.id.nav_shopByCategory:
                        Toast.makeText(HomeActivity.this, "Shop", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_themeStores:
                        Toast.makeText(HomeActivity.this, "Them Stores", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_order:
                        Toast.makeText(HomeActivity.this, "Order", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.faqS:
                          intentWeb = new Intent(HomeActivity.this,WebViewActivity.class);
                         intentWeb.putExtra("content","https://www.myntra.com/faqs");
                        break;
                    case R.id.contactUs:
//                        intentWeb = new Intent(HomeActivity.this,WebViewActivity.class);
//                        intentWeb.putExtra("content","https://www.myntra.com/contactus?loggedIn=true");
                        break;
                    case R.id.legal:
//                        intentWeb = new Intent(HomeActivity.this,WebViewActivity.class);
//                        intentWeb.putExtra("content","https://life.myntra.com/terms/");


                }
                return true;
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
            mTvLoginInHeader.setText("");
            mTvLoginInHeader.setText("Log In  .  Sign Up");
        }else {
            mTvLoginInHeader.setText(PreferenceHelper.getStringFromPreference(LoginPageActivity.PREF_NAME_KEY));
        }
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
                fragment = new com.example.myntraapp.NavFragments.StudioFragment();
                break;
            case R.id.explore:
                fragment = new ExploreFragment();
                break;
            case R.id.profile:
                fragment = new com.example.myntraapp.NavFragments.ProfileFragment();
                break;
        }
        if (fragment != null){
            loadFragment(fragment);
        }
        return true;
    }
}