package com.lib.adssdk.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lib.adssdk.Ads;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Gson gson = new GsonBuilder().setLenient().create();

    public static Retrofit getClient() {

        OkHttpClient httpClient = null;

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.NONE);


        httpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();


        return new Retrofit.Builder()
                .baseUrl(Ads.URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }



}
