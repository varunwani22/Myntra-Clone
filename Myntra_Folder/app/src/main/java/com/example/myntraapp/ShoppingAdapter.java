package com.example.myntraapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingViewHolder> {

    private List<ShopShopModel> shopModelList;
    private ListenerForShopping listenerForShopping;

    public ShoppingAdapter(List<ShopShopModel> shopModelList, ListenerForShopping listenerForShopping) {
        this.shopModelList = shopModelList;
        this.listenerForShopping = listenerForShopping;
    }

    @NonNull
    @Override
    public ShoppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_layout, parent, false);
        return new ShoppingViewHolder(view, listenerForShopping);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingViewHolder holder, int position) {
        ShopShopModel shopModel = shopModelList.get(position);
        holder.setData(shopModel);
    }

    @Override
    public int getItemCount() {
        return shopModelList.size();
    }
}
