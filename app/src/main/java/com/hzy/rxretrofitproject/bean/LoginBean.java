package com.hzy.rxretrofitproject.bean;

/**
 * Created by hzy on 2019/1/11
 **/
public class LoginBean {
    @Override
    public String toString() {
        return "LoginBean{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    private LoginDataBean data;
    private Double errorCode;
    private String errorMsg;

    public LoginDataBean getData() {
        return data;
    }

    public void setData(LoginDataBean data) {
        this.data = data;
    }

    public Double getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Double errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
