package com.project.oop.bitsgo.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.oop.bitsgo.R;


public class AccountFragment extends Fragment {



    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View accountView = inflater.inflate(R.layout.fragment_account, container, false);
        return accountView;
    }
}