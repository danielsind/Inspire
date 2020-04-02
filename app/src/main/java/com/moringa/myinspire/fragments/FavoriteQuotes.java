package com.moringa.myinspire.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringa.myinspire.R;


public class FavoriteQuotes extends Fragment {

    View favoroteQuotesView;
  public FavoriteQuotes (){

  }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        favoroteQuotesView = inflater.inflate(R.layout.fragment_favorite_quotes, container, false);
        return favoroteQuotesView;
    }
}
