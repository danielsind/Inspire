package com.moringa.myinspire.network;

import com.moringa.myinspire.model.Quote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetQuote {
    @GET("/quotes")
    Call<List<Quote>>getQuote();
    @GET("/authors")
    Call<List<Quote>>getAuthor();
}
