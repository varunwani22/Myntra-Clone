package com.example.myntraapp.NavFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.myntraapp.HomeActivity;
import com.example.myntraapp.LoginPageActivity;
import com.example.myntraapp.PreferenceHelper;
import com.example.myntraapp.R;
import com.example.myntraapp.SearchActivity;

public class ProfileFragment extends Fragment {

    private Button mBtnLogin;
    private Button mBtnLogout;
    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewsAndListeners(view);
        PreferenceHelper.getSharedPreferences(getContext());
    }

    private void initViewsAndListeners(View view) {
        mBtnLogin = view.findViewById(R.id.btnLogin);
        mBtnLogout = view.findViewById(R.id.btnLogout);
        if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
            mBtnLogin.setText("Login/SignUp");
        }else {
            mBtnLogin.setText(PreferenceHelper.getStringFromPreference(LoginPageActivity.PREF_NAME_KEY));

        }
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PreferenceHelper.getBooleanFromPreference(LoginPageActivity.PREF_BOOLEAN_KEY)==false){
                    Intent intentLogin = new Intent(getActivity(),LoginPageActivity.class);
                    startActivity(intentLogin);
                }else {
                    mBtnLogin.setText(PreferenceHelper.getStringFromPreference(LoginPageActivity.PREF_NAME_KEY));

                }
            }
        });

        mBtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeBooleanToPreference(LoginPageActivity.PREF_BOOLEAN_KEY,false);
                PreferenceHelper.writeStringToPreference(LoginPageActivity.PREF_NAME_KEY,"");
                PreferenceHelper.writeLongToPreference(LoginPageActivity.PREF_NUMBER_KEY, (long)0);
                Toast.makeText(getContext(),"You Logout Successfully",Toast.LENGTH_SHORT).show();
                mBtnLogin.setText("Login/SignUP");
            }
        });
    }


}