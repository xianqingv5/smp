package com.yiche.smp.common;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * funtion:
 *
 * @Author wangyb
 */
@Configuration
public class Httpclient {

    @Value("${checkout.user.url}")
    private String url;

    /**
     * 校验用户
     *
     * @param username
     * @param password
     * @return
     */
    public String get(String username, String password) throws IOException {
        HttpClient httpClient = null;
        HttpResponse httpResponse = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?user=").append(username).append("&password=").append(password);
        HttpGet httpGet = new HttpGet(url.concat(stringBuffer.toString()));
        httpClient = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity httpEntity = response.getEntity();
        InputStream inputStream = httpEntity.getContent();
        String content = IOUtil.readAsString(inputStream, true);
        return content;
    }

}
