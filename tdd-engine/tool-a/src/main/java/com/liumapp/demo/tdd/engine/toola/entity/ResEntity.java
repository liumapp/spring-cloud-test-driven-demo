package com.liumapp.demo.tdd.engine.toola.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author liumapp
 * @file ResEntity.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/29/18
 */
public class ResEntity implements Serializable {

    private String code;

    private String msg;

    private String content;

    public ResEntity() {
    }

    public ResEntity(String code, String msg, String content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResEntity{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
