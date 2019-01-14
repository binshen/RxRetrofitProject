package com.hzy.rxretrofitproject.http;

import com.hzy.rxretrofitproject.service.ApiService;
import com.hzy.rxretrofitproject.utils.StringConverterFactory;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hzy on 2019/1/10
 * 网络请求
 **/
public class HttpManager {

    private static final String BASE_URL = "http://www.wanandroid.com/";

    private Retrofit mRetrofit;
    private HashMap<Class, Retrofit> mServiceHashMap = new HashMap<>();


    public HttpManager() {
        // init okhttp 3 logger
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        // int okhttp
        OkHttpClient client = new OkHttpClient.Builder()
                .retryOnConnectionFailure(true)
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(45, TimeUnit.SECONDS)
                .writeTimeout(55, TimeUnit.SECONDS)
                .addInterceptor(logInterceptor)
                .build();
        // int retrofit
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(StringConverterFactory.create())
                .build();

        mServiceHashMap.put(ApiService.class, mRetrofit);
    }


    public <T> T getService(Class<T> clz) {
        Retrofit retrofit = mServiceHashMap.get(clz);
        if (retrofit != null) {
            T service = retrofit.create(clz);
            return service;
        } else {
            return null;
        }
    }
}