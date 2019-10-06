package com.example.activity_fragment_service_demo.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.activity_fragment_service_demo.R;

public class ActivityMainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_fragment);

        Fragment mFragment = new FragmentA();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, mFragment, "1")
                .addToBackStack("q")
//                .disallowAddToBackStack()
                .commit();


    }
}
