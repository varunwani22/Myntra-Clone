package com.example.myntraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;

public class SearchActivity extends AppCompatActivity {
    private EditText mSearchCategory;
    private Button mBtnSearch;
    private Button mBtnCamera;
    private ShoppingAdapter shoppingAdapter;
    private Button mBtnMic;
    private String Category;
    private String sample;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViewsAndListeners();
    }

    private void initViewsAndListeners() {
        progressBar = findViewById(R.id.shopProgressBar);
        recyclerView = findViewById(R.id.shopRecyclerView);
        mSearchCategory = findViewById(R.id.etSearchItem);
        mBtnSearch = findViewById(R.id.btnSearchItem);
        mBtnCamera = findViewById(R.id.btnCamera);
        Category = mSearchCategory.getText().toString();
        progressBar.setVisibility(View.VISIBLE);
//        sample = men;
    }

    @Override
    protected void onStart() {
        super.onStart();

            mBtnSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Category.equals("men")) {
                        fetchDataFromAssets();
                    }else {
                        Toast.makeText(SearchActivity.this, "Item not found", Toast.LENGTH_SHORT).show();
//                        fetchDataFromAssets();
                    }
                }
            });
    }


    private void fetchDataFromAssets() {
        try {
            InputStream inputStream = getAssets().open("ResponseForShopping.json");
            int data = inputStream.read();
            StringBuffer stringBuffer = new StringBuffer();
            while (data != -1) {
                char ch = (char) data;
                stringBuffer.append(ch);
                data = inputStream.read();
            }
            buildDataFromJson(stringBuffer.toString());

        } catch (Exception e) {
            Log.d("TAG", e.getMessage());
        }
    }

    private void buildDataFromJson(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ResponseShopModel>() {
        }.getType();
        ResponseShopModel responseShopModel = gson.fromJson(json, type);
        setRecyclerAdapter(responseShopModel);
        progressBar.setVisibility(View.GONE);
    }

    private void setRecyclerAdapter(ResponseShopModel responseShopModel) {
        shoppingAdapter = new ShoppingAdapter(responseShopModel.getShop());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shoppingAdapter);
    }

}