package com.example.myntraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginPageActivity extends AppCompatActivity {
    private ImageView mLoginImage;
    private EditText mEtName;
    private EditText mEtNumber;
    private EditText mEtPassword;
    private Button mBtnContinue;
    public static final String PREF_NAME_KEY = "PREF_NAME_KEY";
    public static final String PREF_NUMBER_KEY = "PREF_NUMBER_KEY";
    public static final String PREF_BOOLEAN_KEY = "PREF_BOOLEAN_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mLoginImage = findViewById(R.id.loginImage);
        mEtName = findViewById(R.id.etName);
        mEtNumber = findViewById(R.id.etNumber);
        mEtPassword = findViewById(R.id.etPassword);
        mBtnContinue = findViewById(R.id.btnContinue);
        PreferenceHelper.getSharedPreferences(this);
        Glide.with(mLoginImage).load("https://constant.myntassets.com/pwa/assets/img/banner_login_landing_300.jpg").into(mLoginImage);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDataValid()){
                    PreferenceHelper.writeStringToPreference(PREF_NAME_KEY,mEtName.getText().toString());
                    PreferenceHelper.writeLongToPreference(PREF_NUMBER_KEY, Long.valueOf(mEtNumber.getText().toString()));
                    PreferenceHelper.writeBooleanToPreference(PREF_BOOLEAN_KEY,true);
                    Intent intent = new Intent();
                }
            }
        });
    }
    private boolean isDataValid(){
        if (mEtName.getText().toString().length()<5){
            mEtName.setError("name should be minimum 5 characters");
            return false;
        }
        if(mEtPassword.getText().toString().length()<6){
            mEtPassword.setError("password should be minimum 6 characters");
            return false;
        }
        if (mEtNumber.getText().toString().length()!=10){
            mEtNumber.setError("enter valid number");
            return false;
        }
        return true;
    }
}