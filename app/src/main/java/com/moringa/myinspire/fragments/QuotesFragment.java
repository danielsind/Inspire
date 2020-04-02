package com.moringa.myinspire.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.myinspire.R;
import com.moringa.myinspire.adapter.QuotesRecyclerViewAdapter;
import com.moringa.myinspire.model.QuotesApiResponse;
import com.moringa.myinspire.network.GetQuoteInterface;
import com.moringa.myinspire.network.RetrofitClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuotesFragment extends Fragment{
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private List<QuotesApiResponse> mQuotes;
    private QuotesRecyclerViewAdapter mQuoteAdapter;
    public QuotesFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_quotes, container, false);
        ButterKnife.bind(this, view);

        GetQuoteInterface client = RetrofitClient.getRetrofit();
        Call<List<QuotesApiResponse>> call = client.getQuotes();


        call.enqueue(new Callback<List<QuotesApiResponse>>() {
            @Override
            public void onResponse(Call<List<QuotesApiResponse>> call, Response<List<QuotesApiResponse>> response) {
                if (response.isSuccessful()){
                    mQuotes = response.body();
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
                    mQuoteAdapter = new QuotesRecyclerViewAdapter(getContext(), mQuotes);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setAdapter(mQuoteAdapter);

                }

            }

            @Override
            public void onFailure(Call<List<QuotesApiResponse>> call, Throwable t) {

            }
        });

        return view;
    }



}
