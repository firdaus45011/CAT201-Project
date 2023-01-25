package com.android.iunoob.bloodbank.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.iunoob.bloodbank.R;

public class BloodConnection extends Fragment {
    private TextView textView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bloodconnection, container, false);
        getActivity().setTitle("Blood Type Match");

        textView = view.findViewById(R.id.connection);
        Linkify.addLinks(textView, Linkify.ALL);
        return  view;
    }
}