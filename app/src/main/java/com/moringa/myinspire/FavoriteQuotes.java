package com.moringa.myinspire;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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
