package com.moringa.myinspire.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.myinspire.model.QuotesApiResponse;

import org.parceler.Parcels;

import java.util.List;

public class FavoriteQuotesRecyclerViewAdapter extends RecyclerView.Adapter<FavoriteQuotesRecyclerViewAdapter.FavoriteQuotesViewHolder> {

    Context mContext;


public FavoriteQuotesRecyclerViewAdapter(Context context ){
    mContext = context;

}
    @NonNull
    @Override
    public FavoriteQuotesRecyclerViewAdapter.FavoriteQuotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteQuotesRecyclerViewAdapter.FavoriteQuotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FavoriteQuotesViewHolder extends RecyclerView.ViewHolder {

        public FavoriteQuotesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
