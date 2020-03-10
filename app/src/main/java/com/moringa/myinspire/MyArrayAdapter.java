package com.moringa.myinspire;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;

public class MyArrayAdapter<S> extends ArrayAdapter {
    private Context mContext;
    private String [] mPosts;
    private String [] mAuthor;

//    public MyArrayAdapter(Context mContext, int resource, String[] mPosts, String[] mAuthor){
//        super(mContext, resource);
//        this.mContext = mContext;
//        this.mPosts = mPosts;
//        this.mAuthor= mAuthor;
//    }

    public MyArrayAdapter(ProfileFragment profileFragment,int resource, String[] posts, String[] author) {
        super(profileFragment.getContext(), resource);
        this.mContext=profileFragment.getContext();
        this.mPosts = posts;
        this.mAuthor = author;
    }
    public MyArrayAdapter(QuotesFragment quotesFragment,int resource, String[] posts, String[] author) {
        super(quotesFragment.getContext(), resource);
        this.mContext=quotesFragment.getContext();
        this.mPosts = posts;
        this.mAuthor = author;
    }

    @Override
    public  Object getItem(int position) {
        String post = mPosts[position];
        String author = mAuthor[position];
        return String.format(" %s \nAuthor: %s ",post,author);
    }
    @Override
    public int getCount(){
        return mPosts.length;
//        Log.d(Integer.toString(mPosts.length));
    }
}
