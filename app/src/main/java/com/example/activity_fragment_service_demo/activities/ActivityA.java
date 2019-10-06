package com.example.activity_fragment_service_demo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.activity_fragment_service_demo.R;

public class ActivityA extends AppCompatActivity {


    private static final String TAG = "ActivityA";

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_a);

        Log.e(TAG, "onCreate");


        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityA.this , ActivityB.class));
            }
        });

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
