package com.example.myntraapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
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

public class SearchActivity extends AppCompatActivity implements ListenerForShopping {

    private static final int CAMERA_PERMISSION_CODE = 1;
    private static final int MIC_PERMISSION_CODE = 2;
    private static final int pic_id = 123;

    private FragmentManager fragmentManagerShop;
    private EditText mSearchCategory;
    private Button mBtnSearch;
    private Button mBtnCamera;
    private ShoppingAdapter shoppingAdapter;
    private Button mBtnMic;
    private String Category;
    private ListenerForShopping listenerForShopping;
    private String sample;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private String priceBuy;
    private String brandBuy;
    private String imageBuy;
    private String titleBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initViewsAndListeners();
        fragmentManagerShop = getSupportFragmentManager();
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

        mBtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(SearchActivity.this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
                boolean isPermissionGranted = ActivityCompat.checkSelfPermission(SearchActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;
                if (!isPermissionGranted) {
                    ActivityCompat.requestPermissions(SearchActivity.this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
                } else {
                    Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(camera_intent, pic_id);
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Category.equals("men")) {
                    fetchDataFromAssets();
                } else {
                    fetchDataFromAssets();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

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
        shoppingAdapter = new ShoppingAdapter(responseShopModel.getShop(), this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shoppingAdapter);
    }

    @Override
    public void onItemClicked(ShopShopModel shopShopModel, int position) {
        titleBuy = shopShopModel.getTitle();
        priceBuy = shopShopModel.getPrice();
        brandBuy = shopShopModel.getBrand();
        imageBuy = shopShopModel.getAvatar();
        Bundle bundle = new Bundle();
        bundle.putString("title1", titleBuy);
        bundle.putString("price1", priceBuy);
        bundle.putString("brand1", brandBuy);
        bundle.putString("image1", imageBuy);
        FragmentTransaction fragmentTransaction = fragmentManagerShop.beginTransaction();
        SearchItemFragment fragment = new SearchItemFragment();
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.flContainerShop, fragment, "studentFrag").addToBackStack("studentFrag").commit();

    }

}