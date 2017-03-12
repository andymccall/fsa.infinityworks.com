package com.infinityworks.fsa.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

/**
 * The BaseDAO class is
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class BaseDAO {

    @Value("${url.protocol}")
    private String urlProtocol;

    @Value("${url.base}")
    private String urlBase;

    @Value("${api.version}")
    private String apiVersion;

    private HttpHeaders httpHeaders;

    public String getApiVersion() {
        return apiVersion;
    }

    public String getUrlProtocol () {
        return urlProtocol;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public HttpHeaders getHttpHeaders() {

        httpHeaders = new HttpHeaders();
        httpHeaders.add("x-api-version",
                getApiVersion());

        return httpHeaders;
    }

    @Override
    public String toString() {
        return "BaseDAO{" +
                "urlProtocol='" + urlProtocol + '\'' +
                ", urlBase='" + urlBase + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                '}';
    }
}
