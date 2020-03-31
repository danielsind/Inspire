package com.moringa.myinspire.network;

import com.moringa.myinspire.model.QuotesApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetQuoteInterface  {
    @GET("/quotes")
    Call<List<QuotesApiResponse>> getQuotes();
}
