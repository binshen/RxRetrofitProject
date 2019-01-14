package com.hzy.rxretrofitproject.service;

import com.hzy.rxretrofitproject.bean.KnowledgeSystem;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by hzy on 2019/1/10
 * ApiService
 **/
public interface ApiService {

    /**
     * 获取知识体系数据
     * @param page
     * @param cid
     * @return
     */
    @GET("article/list/{page}/json")
    Observable<KnowledgeSystem> getKnowledgeSystem(@Path("page") int page, @Query("cid") int cid);

}
