package com.zlp.springboot.vo;

/**
 * Created by lenovo on 2017/8/7.
 */
public class ResultJson<T> {

    private Boolean success;
    private String message;
    private T data;
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
