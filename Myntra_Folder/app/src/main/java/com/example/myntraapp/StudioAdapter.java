package com.example.myntraapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudioAdapter extends RecyclerView.Adapter<StudioViewHolder> {
    private List<StudioStudioModel> studioModelList;

    public StudioAdapter(List<StudioStudioModel> studioModelList) {
        this.studioModelList = studioModelList;
    }

    @NonNull
    @Override
    public StudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.studio_layout, parent,false);
        return new StudioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudioViewHolder holder, int position) {
        StudioStudioModel studioStudioModel = studioModelList.get(position);
        holder.setStudioData(studioStudioModel);
    }

    @Override
    public int getItemCount() {
        return studioModelList.size();
    }
}
