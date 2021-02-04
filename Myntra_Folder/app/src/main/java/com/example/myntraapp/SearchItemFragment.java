package com.example.myntraapp;

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

import com.bumptech.glide.Glide;
import com.example.myntraapp.NavFragments.AddToBaggage;

import org.w3c.dom.Text;

public class SearchItemFragment extends Fragment{
    private ImageView mIvProductImage;
    private TextView mTvTitleOFProduct;
    private TextView mTvPriceOfProduct;
    private Button mBtnAddToBag;
    private String ImageShow;
    private String Brand1;
    private String Price1;
    private String Title1;

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

        mBtnAddToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("title2",Title1);
                bundle1.putString("image2",ImageShow);
                bundle1.putString("brand2",Brand1);
                bundle1.putString("price2",Price1);
                AddToBaggage addToBaggage = new AddToBaggage();
                addToBaggage.setArguments(bundle1);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.flContainerShop,addToBaggage,"addToBaggage").commit();


            }
        });
    }
}