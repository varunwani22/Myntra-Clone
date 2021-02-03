package com.example.myntraapp;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;


public class StudioFragment extends Fragment {

    private RecyclerView recyclerViewForStudio;



    public StudioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_studio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);

    }

    @Override
    public void onStart() {
        super.onStart();
        fetchDataFromAssets();
    }

    private void initViews(View view) {
        recyclerViewForStudio = view.findViewById(R.id.recyclerViewForStudio);
    }


    private void fetchDataFromAssets(){
        try {
           InputStream inputStream = getContext().getAssets().open("ResponseForStudio.json");
           int data = inputStream.read();
           StringBuffer stringBuffer = new StringBuffer();
           while (data!=-1){
               char ch = (char) data;
               stringBuffer.append(ch);
               data = inputStream.read();
           }
           buildDataFromJson(stringBuffer.toString());

        }catch (Exception e){
            Log.d("TAG", e.getMessage());
        }
    }

    private void buildDataFromJson(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<ResponseStudioModel>(){}.getType();
        ResponseStudioModel responseStudioModel = gson.fromJson(json, type);
        setRecyclerAdapter(responseStudioModel);
    }

    private void setRecyclerAdapter(ResponseStudioModel responseStudioModel) {
        StudioAdapter studioAdapter = new StudioAdapter(responseStudioModel.getStudio());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewForStudio.setLayoutManager(linearLayoutManager);
        recyclerViewForStudio.setAdapter(studioAdapter);
    }

}