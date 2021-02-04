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


public class HomeFirstViewFragmentD extends Fragment {
    private ImageView mHomeFirstViewImageD;

    public static HomeFirstViewFragmentD newInstance() {
        HomeFirstViewFragmentD homeFirstViewFragmentD = new HomeFirstViewFragmentD();
        return homeFirstViewFragmentD;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_first_view_d, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mHomeFirstViewImageD = view.findViewById(R.id.homeFirstViewImageD);
        Glide.with(mHomeFirstViewImageD).load("https://assets.myntassets.com/f_webp,dpr_1.5,q_60,w_400,c_limit,fl_progressive/assets/images/2021/2/1/2acf3a53-8991-45f1-b22f-7ba4795227c21612166300722-crocs.jpg").into(mHomeFirstViewImageD);

    }
}