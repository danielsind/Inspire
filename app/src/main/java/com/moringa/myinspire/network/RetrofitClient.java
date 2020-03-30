package com.moringa.myinspire.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static String BASE_URL = "http://ourquotesapp.herokuapp.com?format=json";

    public static GetQuoteInterface  getRetrofit(){
        if (retrofit != null){
            retrofit =  new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(GetQuoteInterface.class);
    }
}
