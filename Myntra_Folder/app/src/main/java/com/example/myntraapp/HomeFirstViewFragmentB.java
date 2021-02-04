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


public class HomeFirstViewFragmentB extends Fragment {
private ImageView mHomeFirstViewImageB;

    public static HomeFirstViewFragmentB newInstance() {
        HomeFirstViewFragmentB homeFirstViewFragmentB = new HomeFirstViewFragmentB();
        return homeFirstViewFragmentB;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_first_view_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHomeFirstViewImageB = view.findViewById(R.id.homeFirstViewImageB);
        Glide.with(mHomeFirstViewImageB).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/7f936ef9-f5c4-45cd-9e81-b9c881eb2ad91612189970940-cat-fest-men-indian.jpg").into(mHomeFirstViewImageB);
    }
}