package com.google.play.retrofit;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface RequestInterface {

    @Headers({"Accept: application/json"})
    @GET("{id}")
    Call<ResponseBody> getData(@Path("id") String url);
}



