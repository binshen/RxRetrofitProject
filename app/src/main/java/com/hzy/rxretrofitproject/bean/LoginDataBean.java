package com.hzy.rxretrofitproject.bean;

import java.util.List;

/**
 * Created by hzy on 2019/1/11
 **/
public class LoginDataBean {
    @Override
    public String toString() {
        return "LoginDataBean{" +
                "chapterTops=" + chapterTops +
                ", collectIds=" + collectIds +
                ", email='" + email + '\'' +
                ", icon='" + icon + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                ", type=" + type +
                '}';
    }

    private List<Double> chapterTops;
    private List<Double> collectIds;
    private String email;
    private String icon;
    private String password;
    private String token;
    private String username;
    private Double id;
    private Double type;

    public List<Double> getChapterTops() {
        return chapterTops;
    }

    public void setChapterTops(List<Double> chapterTops) {
        this.chapterTops = chapterTops;
    }

    public List<Double> getCollectIds() {
        return collectIds;
    }

    public void setCollectIds(List<Double> collectIds) {
        this.collectIds = collectIds;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getType() {
        return type;
    }

    public void setType(Double type) {
        this.type = type;
    }
}
