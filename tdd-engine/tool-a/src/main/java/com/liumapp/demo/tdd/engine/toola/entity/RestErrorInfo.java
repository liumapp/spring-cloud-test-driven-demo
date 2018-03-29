package com.liumapp.demo.tdd.engine.toola.entity;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * A sample class for adding error information in the response
 */
@XmlRootElement
public class RestErrorInfo {
    public final String detail;
    public final String message;

    public RestErrorInfo(Exception ex, String detail) {
        this.message = ex.getLocalizedMessage();
        this.detail = detail;
    }
}
