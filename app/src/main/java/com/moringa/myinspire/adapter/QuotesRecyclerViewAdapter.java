package com.moringa.myinspire.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.myinspire.R;
import com.moringa.myinspire.model.QuoteResponse;

import java.util.List;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuotesRecyclerViewAdapter extends RecyclerView.Adapter<QuotesRecyclerViewAdapter.QuotesViewHolder> {
    Context mContext;
    List<QuoteResponse> mQuotes;

    public QuotesRecyclerViewAdapter(Context context, List<QuoteResponse> quotes){
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

    public class QuotesViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.authorTextView)
        TextView mAuthorTextView;
        @BindView(R.id.quoteTextView) TextView mQuoteTextView;

        public QuotesViewHolder(@NonNull View itemView) {
            super(itemView);
            mContext = itemView.getContext();
            ButterKnife.bind(this, itemView);

        }

        public void bindQuotes(QuoteResponse quoteResponse) {
            mAuthorTextView.setText(quoteResponse.getAuthor());
            mQuoteTextView.setText(quoteResponse.getQuote());
        }
    }

}
