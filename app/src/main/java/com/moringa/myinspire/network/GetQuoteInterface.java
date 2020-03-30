package com.moringa.myinspire.network;

import com.moringa.myinspire.model.QuoteResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetQuoteInterface  {
    @GET
    Call<List<QuoteResponse>> getQuotes();
}
