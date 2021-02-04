package com.example.myntraapp.NavFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myntraapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {
private ImageView mImageSeasonOfferCategory;
private ImageView mImageWomenCategory;
private ImageView mImageMenCategory;
private ImageView mImageFootWearCategory;
private ImageView mImageKidsCategory;
private ImageView mFurnishCategory;
private ImageView mTraditionalCategory;
private ImageView mDressesCategory;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CategoryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CategoryFragment newInstance(String param1, String param2) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewAndClickListeners(view);
    }

    private void initViewAndClickListeners(View view) {
        mImageSeasonOfferCategory = view.findViewById(R.id.imageSeasonOffersCategory);
        mImageWomenCategory = view.findViewById(R.id.imageWomenCategory);
        mImageMenCategory = view.findViewById(R.id.imageMenCategory);
        mImageFootWearCategory = view.findViewById(R.id.imageFootWearCategory);
        mImageKidsCategory = view.findViewById(R.id.imageKidsCategory);
        mFurnishCategory = view.findViewById(R.id.imageFurnishCategory);
        mTraditionalCategory = view.findViewById(R.id.imageTraditionalCategory);
        mDressesCategory = view.findViewById(R.id.imageDressesCategory);
        Glide.with(mImageSeasonOfferCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2020/8/31/00e0c30e-e48b-46e4-854b-3b4c412246ea1598862765967-Dk22.jpg").into(mImageSeasonOfferCategory);
        Glide.with(mImageWomenCategory)
          .load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/2/1/d703940a-e331-4edc-af6d-0cd18c4cc6d21612194274933-Tops-Tees_Desk.jpg").into(mImageWomenCategory);
        Glide.with(mImageMenCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/2/1/f6dce3c6-3dca-4447-b4b2-2f382cfa00f81612192947460-Sportswear_Desk--3-.jpg").into(mImageMenCategory);
        Glide.with(mImageFootWearCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/1/31/dbf2958f-8eaa-4413-9369-718ed760ab8d1612094025562-Sports-Shoes_Desk.jpg").into(mImageFootWearCategory);
        Glide.with(mImageKidsCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/2/1/f6dce3c6-3dca-4447-b4b2-2f382cfa00f81612192947460-Sportswear_Desk--3-.jpg").into(mImageKidsCategory);
        Glide.with(mFurnishCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/banners/2018/6/8/eff01060-f706-468d-b97c-95cdf43174f91528443826867-Desktop-Home-Banner.jpg").into(mFurnishCategory);
        Glide.with(mTraditionalCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/2/1/34b93a04-8b6a-4423-85e7-dc7f24e5e6ef1612189970954-cat-fest-dk-men-indian.jpg").into(mTraditionalCategory);
        Glide.with(mDressesCategory).load("https://assets.myntassets.com/f_webp,w_980,c_limit,fl_progressive,dpr_2.0/assets/images/2021/2/1/7eb256b4-6d48-446b-8f19-988e24a780a81612190258620-Dresses_Desk--1-.jpg").into(mDressesCategory);

    }
}