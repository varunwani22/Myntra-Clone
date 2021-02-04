package com.example.myntraapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class HomeFirstViewFragmentA extends Fragment {
private ImageView mHomeFirstViewImageA;

    public static HomeFirstViewFragmentA newInstance() {
        HomeFirstViewFragmentA homeFirstViewFragmentA = new HomeFirstViewFragmentA();
        return homeFirstViewFragmentA;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_first_view_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHomeFirstViewImageA = view.findViewById(R.id.homeFirstViewImageA);
        Glide.with(mHomeFirstViewImageA).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/8d53e916-bc06-4e16-96f5-1809c912443e1612187930227-Content-banner-NS21.jpg").into(mHomeFirstViewImageA);
    }
}