package com.moringa.myinspire;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.moringa.myinspire.adapter.MyArrayAdapter;
import com.moringa.myinspire.model.Quote;
import com.moringa.myinspire.network.GetQuote;
import com.moringa.myinspire.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuotesFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater.ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_quotes, container,false);
        ButterKn
    }

}
