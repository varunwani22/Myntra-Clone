package com.example.myntraapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ShoppingViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvShopImage;
    private CardView mShopCardView;
    private TextView mTvShopBrand;
    private TextView mTvShopTitle;
    private TextView mTvShopPrice;
    private ListenerForShopping listenerForShopping;


    public ShoppingViewHolder(@NonNull View itemView, ListenerForShopping listenerForShopping) {
        super(itemView);
        this.listenerForShopping = listenerForShopping;
        initViewAndListeners(itemView);
    }

    private void initViewAndListeners(View itemView) {
        mIvShopImage = itemView.findViewById(R.id.shopImage);
        mTvShopBrand = itemView.findViewById(R.id.shopBrand);
        mTvShopTitle = itemView.findViewById(R.id.shopTitle);
        mTvShopPrice = itemView.findViewById(R.id.shopPrice);
        mShopCardView = itemView.findViewById(R.id.shopCard);

    }

    public void setData(ShopShopModel shopModel) {
        Glide.with(mIvShopImage).load(shopModel.getAvatar()).into(mIvShopImage);
        mTvShopBrand.setText(shopModel.getBrand());
        mTvShopTitle.setText(shopModel.getTitle());
        mTvShopPrice.setText(shopModel.getPrice());

        mShopCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerForShopping.onItemClicked(shopModel,getAdapterPosition());
            }
        });

    }


}
