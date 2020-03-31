package com.moringa.myinspire.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static String BASE_URL = "https://programming-quotes-api.herokuapp.com";

    public static GetQuoteInterface getRetrofit(){
        if (retrofit == null){
            retrofit =  new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        assert retrofit != null;
        return retrofit.create(GetQuoteInterface.class);
    }
}
