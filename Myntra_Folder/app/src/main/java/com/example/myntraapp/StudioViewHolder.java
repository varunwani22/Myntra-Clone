package com.example.myntraapp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class StudioViewHolder extends RecyclerView.ViewHolder {
    private TextView mStudioName;
    private TextView mStudioFollow;
    private TextView mStudioTime;
    private ImageView mStudioImage;
    public View mLikePost;
    public View mSavePost;
    private TextView mStudioDescription;
    private Boolean token= false;
    private ItemClickListener itemClickListener;


    public StudioViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mStudioName = itemView.findViewById(R.id.tvNameOfPerson);
        mStudioFollow = itemView.findViewById(R.id.tvFollow);
        mStudioTime = itemView.findViewById(R.id.tvTimeAgo);
        mStudioImage = itemView.findViewById(R.id.imagePerson);
        mSavePost = itemView.findViewById(R.id.vSave);
        mLikePost = itemView.findViewById(R.id.LikePost);
        mStudioDescription = itemView.findViewById(R.id.studioDescription);
    }

    public void setStudioData(StudioStudioModel studioStudioModel) {
        mStudioName.setText(studioStudioModel.getName());
        mStudioFollow.setText(studioStudioModel.getFollow());
        mStudioTime.setText(studioStudioModel.getOnlineStatus());
        Glide.with(mStudioImage).load(studioStudioModel.getAvatar()).into(mStudioImage);
        mStudioDescription.setText(studioStudioModel.getDescription());
    }
}
