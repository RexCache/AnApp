package com.example.anapp;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class AnApp extends Application {
    public static Context context;
    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        sharedPreferences = context.getSharedPreferences("AnApp", Context.MODE_PRIVATE);



    }

    // Shared Preferences
    public static void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public static void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public static void putInteger(String key, Integer value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static Integer getInteger(String key) {
        return sharedPreferences.getInt(key, 0);
    }

}