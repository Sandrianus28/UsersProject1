package com.utsmobilelanjutan.usersproject.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URl ="http://jsonplaceholder.typicode.com";
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URl).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
