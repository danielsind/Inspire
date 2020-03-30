package com.moringa.myinspire.network;

import com.moringa.myinspire.model.Quote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetQuoteInterface  {
    @GET
    Call<List<Quote>> getQuote(@Query("format") String json);
}
