package com.moringa.myinspire.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaRouter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.myinspire.R;
import com.moringa.myinspire.fragments.FavoriteQuotes;
import com.moringa.myinspire.model.QuotesApiResponse;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuotesRecyclerViewAdapter extends RecyclerView.Adapter<QuotesRecyclerViewAdapter.QuotesViewHolder> implements View.OnClickListener {
    Context mContext;
    List<QuotesApiResponse> mQuotes;
    @BindView(R.id.saveFavoriteQuote)
    Button mSaveFavoriteQuote;

    public QuotesRecyclerViewAdapter(Context context, List<QuotesApiResponse> quotes){
        mContext = context;
        mQuotes = quotes;

    }



    @NonNull
    @Override
    public QuotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View quoteView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_quote_detail, parent, false);
        return new QuotesViewHolder(quoteView);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesRecyclerViewAdapter.QuotesViewHolder holder, int position) {
        holder.bindQuotes(mQuotes.get(position));
    }

    @Override
    public int getItemCount() {
        return mQuotes.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class QuotesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.authorTextView) TextView mAuthorTextView;
        @BindView(R.id.quoteTextView) TextView mQuoteTextView;
        @BindView(R.id.sourceTextView) TextView mSourceTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;

        public QuotesViewHolder(@NonNull View itemView) {
            super(itemView);
            mContext = itemView.getContext();
            ButterKnife.bind(this, itemView);

        }

        public void bindQuotes(QuotesApiResponse quoteResponse) {
            mAuthorTextView.setText("Author: "+quoteResponse.getAuthor());
            mQuoteTextView.setText(quoteResponse.getEn());
            mSourceTextView.setText("Number of Votes: "+quoteResponse.getNumberOfVotes());
            mRatingTextView.setText("Rating: "+ quoteResponse.getRating());
        }

        @Override
        public void onClick(View view) {
            int position = getLayoutPosition();
            Intent intent = new Intent(mContext, FavoriteQuotesRecyclerViewAdapter.class);
            intent.putExtra("position", position);
            intent.putExtra("mQuotes", Parcels.wrap(mQuotes));
            mContext.startActivity(intent);

        }
    }

}
