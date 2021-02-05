package com.example.myntraapp.NavFragments;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myntraapp.R;

public class AddToBaggage extends Fragment {
    private ImageView mImageOfItem;
    private TextView mBrandOfItem;
    private TextView mTitleOfItem;
    private TextView mPriceOfItem;
    private TextView mTotalPrice;
    private Button mBtnPlaceOrder;
    private String ImageShow;

    public AddToBaggage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_to_baggage, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewsAndListeners(view);
        getDataFromItemFragment();
    }

    private void getDataFromItemFragment() {
        if (getArguments()!=null){
            mBrandOfItem.setText(getArguments().getString("brand2"));
            ImageShow = getArguments().getString("image2");
            Glide.with(mImageOfItem).load(ImageShow).into(mImageOfItem);
            mTitleOfItem.setText(getArguments().getString("title2"));
            mPriceOfItem.setText(getArguments().getString("price2"));
            mTotalPrice.setText(getArguments().getString("price2"));
        }
    }

    private void initViewsAndListeners(View view) {
        mImageOfItem = view.findViewById(R.id.ivPicOfItem);
        mBrandOfItem = view.findViewById(R.id.brandNameBag);
        mTitleOfItem = view.findViewById(R.id.nameOfProduct);
        mPriceOfItem = view.findViewById(R.id.priceOfProduct);
        mTotalPrice = view.findViewById(R.id.AmountOfBuying);
        mBtnPlaceOrder = view.findViewById(R.id.PlaceOrder);

        mBtnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("CONGRATULATION..");
                builder.setMessage("Your Order is Placed!")
                        .show();
            }
        });

    }
}