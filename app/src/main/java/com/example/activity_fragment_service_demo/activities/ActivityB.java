package com.example.activity_fragment_service_demo.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {


    private static final String TAG = "ActivityB";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e(TAG, "onCreate");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");

    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");

    }



}
