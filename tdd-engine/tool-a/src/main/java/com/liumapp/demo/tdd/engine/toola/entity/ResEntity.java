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
@Component
public class ResEntity implements Serializable {

    private Integer code;

    private String msg;

    private String content;

    public ResEntity() {
    }

    public ResEntity(Integer code, String msg, String content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
