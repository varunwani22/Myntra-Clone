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


public class HomeFirstViewFragmentE extends Fragment {
    private ImageView mHomeFirstViewImageE;


    public static HomeFirstViewFragmentE newInstance() {
        HomeFirstViewFragmentE homeFirstViewFragmentE = new HomeFirstViewFragmentE();
        return homeFirstViewFragmentE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_first_view_e, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHomeFirstViewImageE = view.findViewById(R.id.homeFirstViewImageE);
        Glide.with(mHomeFirstViewImageE).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/e4dc3131-3842-4840-ada0-1818adfa64021612189971002-Maxessorize-Main-banner.jpg").into(mHomeFirstViewImageE);

    }
}