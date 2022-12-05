package com.example.tuannkph15655.network;

import com.example.tuannkph15655.model.AccountResult;
import com.example.tuannkph15655.model.BookResult;
import com.example.tuannkph15655.model.RegisterResult;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    ApiService API_SERVICE = new Retrofit.Builder()
            .baseUrl("https://servernodejs-production.up.railway.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService.class);



    @FormUrlEncoded
    @POST("auth/register")
    Call<RegisterResult> register(@Field("fullName") String fullName,
                                  @Field("email") String email,
                                  @Field("userName") String userName,
                                  @Field("password") String password);
    @FormUrlEncoded
    @POST("auth/login")
    Call<RegisterResult> login(@Field("username") String username,
                                 @Field("password") String password);

    @GET("api/getAllBook??")
    Call<BookResult> getListBook(@Query("page") int page,
                               @Query("size") int size,
                                 @Query("idManga") int idManga,
                                 @Query("idUser") int idUser,
                                 @Query("password") String password);
}
