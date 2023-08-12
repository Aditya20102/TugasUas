package com.adit.tugasuas.ui.info;
//Aditya Mahendra Pamungkas 10120156 IF-4

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.adit.tugasuas.R;

public class InfoFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_info_fragment2, container, false);
        return rootView;
    }
}