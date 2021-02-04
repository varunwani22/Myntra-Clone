package com.example.myntraapp;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapterHomeFirstFrag extends FragmentStatePagerAdapter {
    public ViewPagerAdapterHomeFirstFrag(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return HomeFirstViewFragmentA.newInstance();
            case 1:
                return HomeFirstViewFragmentB.newInstance();
            case 2:
                return HomeFirstViewFragmentC.newInstance();
            case 3:
                return HomeFirstViewFragmentD.newInstance();
            case 4:
                return HomeFirstViewFragmentE.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
