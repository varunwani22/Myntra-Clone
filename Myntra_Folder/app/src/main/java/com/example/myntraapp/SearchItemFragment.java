package com.example.myntraapp;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.myntraapp.NavFragments.AddToBaggage;

import org.w3c.dom.Text;

public class SearchItemFragment extends Fragment{
    private ImageView mIvProductImage;
    private TextView mTvTitleOFProduct;
    private TextView mTvPriceOfProduct;
    private Button mBtnWishList;
    private Button mBtnAddToBag;
    private String ImageShow;
    private String Brand1;
    private String Price1;
    private String Title1;
    private boolean isWishList = false;
    private Button mBtnXs, mBtnS , mBtnM, mBtnL, mBtnXL;
    private boolean isSizeSelected=false;
    private View mBackInProductPage;

    public SearchItemFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PreferenceHelper.getSharedPreferences(getContext());
        initViews(view);
        getDataFromArguments();
    }

    private void getDataFromArguments() {
        if (getArguments()!= null){
            Title1 = getArguments().getString("title1");
            ImageShow = getArguments().getString("image1");
            Brand1 = getArguments().getString("brand1");
            Price1 = getArguments().getString("price1");
            Glide.with(mIvProductImage).load(ImageShow).into(mIvProductImage);
            mTvTitleOFProduct.setText(Brand1);
            mTvPriceOfProduct.setText(Price1);
//            mTvTitleOFProduct.setText(getArguments().getString("brand1"));
//            mTvPriceOfProduct.setText(getArguments().getString("price1"));
        }
    }

    private void initViews(View view) {
        mIvProductImage = view.findViewById(R.id.productImageBuy);
        mTvTitleOFProduct = view.findViewById(R.id.brandNameBuy);
        mTvPriceOfProduct = view.findViewById(R.id.priceToBuy);
        mBtnAddToBag = view.findViewById(R.id.btnAddToBag);
        mBtnWishList = view.findViewById(R.id.btnWishList);
        mBackInProductPage =view.findViewById(R.id.backInProductPage);
        mBtnXs = view.findViewById(R.id.btnXs);
        mBtnS = view.findViewById(R.id.btnS);
        mBtnM = view.findViewById(R.id.btnM);
        mBtnL = view.findViewById(R.id.btnL);
        mBtnXL = view.findViewById(R.id.btnXL);

        mBackInProductPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        mBtnAddToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==true){

                    if (isSizeSelected==true){

                        Bundle bundle1 = new Bundle();
                        bundle1.putString("title2",Title1);
                        bundle1.putString("image2",ImageShow);
                        bundle1.putString("brand2",Brand1);
                        bundle1.putString("price2",Price1);
                        AddToBaggage addToBaggage = new AddToBaggage();
                        addToBaggage.setArguments(bundle1);
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.flContainerShop,addToBaggage,"addToBaggage").commit();

                    }else {
                        Toast.makeText(getContext(),"Please Select Size",Toast.LENGTH_SHORT).show();
                    }

                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage("Please Login");
                    builder.setCancelable(true);
                    builder.show();
                }

            }
        });
        mBtnWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==true){

                    if (isWishList==false){

                        mBtnWishList.setText("WISHLISTED");
                        mBtnWishList.setTextColor(getActivity().getResources().getColor(R.color.themeColor));

                        isWishList=true;
                    }else{
                        mBtnWishList.setText("WISHLIST");
                        mBtnWishList.setTextColor(getActivity().getResources().getColor(R.color.black));
                       isWishList=false;
                    }

                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setMessage("Please Login");
                    builder.setCancelable(true);
                    builder.show();
                }
            }
        });

        mBtnXs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSizeSelected = true;
                mBtnXs.setTextColor(getActivity().getResources().getColor(R.color.white));
                mBtnXs.setBackground(getActivity().getDrawable(R.drawable.roung_for_size_themecolor));

                mBtnS.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnS.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnM.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnM.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnXL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
            }
        });
        mBtnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSizeSelected = true;

                mBtnS.setTextColor(getActivity().getResources().getColor(R.color.white));
                mBtnS.setBackground(getActivity().getDrawable(R.drawable.roung_for_size_themecolor));

                mBtnXs.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXs.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnM.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnM.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnXL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));

            }
        });
        mBtnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSizeSelected = true;

                mBtnM.setTextColor(getActivity().getResources().getColor(R.color.white));
                mBtnM.setBackground(getActivity().getDrawable(R.drawable.roung_for_size_themecolor));

                mBtnXs.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXs.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnS.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnS.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnXL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));

            }
        });
        mBtnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSizeSelected = true;

                mBtnL.setTextColor(getActivity().getResources().getColor(R.color.white));
                mBtnL.setBackground(getActivity().getDrawable(R.drawable.roung_for_size_themecolor));

                mBtnXs.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXs.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnS.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnS.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnM.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnM.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnXL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));

            }
        });
        mBtnXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSizeSelected = true;

                mBtnXL.setTextColor(getActivity().getResources().getColor(R.color.white));
                mBtnXL.setBackground(getActivity().getDrawable(R.drawable.roung_for_size_themecolor));

                mBtnXs.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnXs.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnS.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnS.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnM.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnM.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
                mBtnL.setTextColor(getActivity().getResources().getColor(R.color.black));
                mBtnL.setBackground(getActivity().getDrawable(R.drawable.round_for_size));
            }
        });

    }
}