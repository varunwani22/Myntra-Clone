package com.example.myntraapp;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    private static SharedPreferences sharedPreferences;
    private static final String PREFERENCE_DB_NAME ="small_database";

    public static SharedPreferences getSharedPreferences(Context context){
        if (sharedPreferences == null){
            sharedPreferences = context.getSharedPreferences(PREFERENCE_DB_NAME,context.MODE_PRIVATE);
        }
        return sharedPreferences;
    }
    public static  void writeStringToPreference(String key,String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();
    }
    public static void writeBooleanToPreference(String key,Boolean value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    public static void writeLongToPreference(String key,Long value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key,value);
        editor.apply();
    }
    public static String getStringFromPreference(String key){
        return sharedPreferences.getString(key,"");
    }
    public static Boolean getBooleanFromPreference(String key){
        return sharedPreferences.getBoolean(key,false);
    }
    public static Long getLongFromPreference(String key){
        return sharedPreferences.getLong(key,0);
    }
}

