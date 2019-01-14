package com.hzy.rxretrofitproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.hzy.rxretrofitproject.bean.KnowledgeSystem;
import com.hzy.rxretrofitproject.service.ApiService;
import com.hzy.rxretrofitproject.utils.RxSchedulers;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    /**
     * Hello World!
     */
    private TextView mTvHello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvHello = (TextView) findViewById(R.id.tv_hello);

        App.apiService(ApiService.class)
                .getKnowledgeSystem(1, 60)
                .compose(RxSchedulers.<KnowledgeSystem>io_main())
                .subscribe(new Consumer<KnowledgeSystem>() {
                    @Override
                    public void accept(KnowledgeSystem knowledgeSystem) throws Exception {
                        Log.e(TAG, "KnowledgeSystem--" + knowledgeSystem.toString());
                        mTvHello.setText(knowledgeSystem.toString());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e(TAG, "Throwable--" + throwable.toString());
                    }
                });

    }
}
