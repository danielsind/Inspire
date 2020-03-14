package com.moringa.myinspire;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.moringa.myinspire.adapter.MyArrayAdapter;

import butterknife.BindView;


public class ProfileFragment extends Fragment {
    ListView lv;
    SearchView searchView;
    MyArrayAdapter adapter;
    @BindView(R.id.shareButton)
    FloatingActionButton mShareButton;

    public String[] posts = new String[] {"Work Hard Always","Be Positive", "Never give Up","Genius is HardWork","Winners win from the start"};
    public String[] author = new String[] {"James","Myles","Jonah","Henry","Timothy"};

    public ProfileFragment (){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        lv = (ListView) view.findViewById(R.id.listView);
        adapter = new MyArrayAdapter(this, android.R.layout.simple_list_item_1, posts, author);
        lv.setAdapter(adapter);
        return view;
    }
}

