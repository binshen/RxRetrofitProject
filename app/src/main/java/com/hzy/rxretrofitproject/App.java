package com.hzy.rxretrofitproject;

import android.app.Application;

import com.hzy.rxretrofitproject.http.HttpManager;

/**
 * Created by hzy on 2019/1/14
 **/
public class App extends Application {

    private static App mInstance;
    private HttpManager mHttpManager = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        mHttpManager = new HttpManager();
    }

    public static <T> T apiService(Class<T> clz) {
        return getInstance().mHttpManager.getService(clz);
    }


    public static App getInstance(){
        return mInstance;
    }


}
