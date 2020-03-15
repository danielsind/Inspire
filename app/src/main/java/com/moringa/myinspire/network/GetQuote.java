package com.moringa.myinspire.network;

import com.moringa.myinspire.model.Quote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetQuote {
    @GET("/quote")
    Call<Quote>getQuote();
}
