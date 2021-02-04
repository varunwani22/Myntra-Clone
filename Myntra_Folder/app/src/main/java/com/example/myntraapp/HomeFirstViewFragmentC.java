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


public class HomeFirstViewFragmentC extends Fragment {
private ImageView mHomeFirstViewImageC;

    public static HomeFirstViewFragmentC newInstance() {
        HomeFirstViewFragmentC homeFirstViewFragmentC = new HomeFirstViewFragmentC();
        return homeFirstViewFragmentC;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_first_view_c, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHomeFirstViewImageC = view.findViewById(R.id.homeFirstViewImageC);
        Glide.with(mHomeFirstViewImageC).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/34904667-5c6f-4619-94a7-30afe68ebd001612190258587-cat-fest-men-casual--2-.jpg").into(mHomeFirstViewImageC);

    }
}