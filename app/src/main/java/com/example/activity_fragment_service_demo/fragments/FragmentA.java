package com.example.activity_fragment_service_demo.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.activity_fragment_service_demo.R;

public class FragmentA extends Fragment {

    private static final String TAG = "FragmentA";


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView");

        return inflater.inflate(R.layout.fragment1, parent, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //Log.e(TAG, "onViewCreated");

        Button button = (Button) view.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment = new FragmentB();

                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame, mFragment, "2")
                        .addToBackStack("w")
//                .disallowAddToBackStack()
                        .commit();
            }
        });

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.e(TAG, "onActivityCreated");

    }




    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");

    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");

    }



    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");

    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach");
    }
}
