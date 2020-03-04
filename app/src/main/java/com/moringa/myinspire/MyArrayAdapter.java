package com.moringa.myinspire;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String [] mPosts;
    private String [] mAuthor;

    public MyArrayAdapter(Context mContext, int resource,String mUserName, String[] mPosts, String[] mAuthor){
        super(mContext, resource);
        this.mContext = mContext;
        this.mPosts = mPosts;
        this.mAuthor= mAuthor;
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
    }
}
