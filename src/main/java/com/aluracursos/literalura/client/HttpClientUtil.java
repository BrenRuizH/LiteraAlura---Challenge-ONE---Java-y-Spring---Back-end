package com.aluracursos.literalura.client;

import java.net.http.HttpClient;

public class HttpClientUtil {
    private static final HttpClient httpClient = HttpClient.newBuilder().build();

    public static HttpClient getHttpClient() {
        return httpClient;
    }
}
