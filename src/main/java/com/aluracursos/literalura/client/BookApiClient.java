package com.aluracursos.literalura.client;

import java.net.URI;
import java.net.http.HttpRequest;

public class BookApiClient {
    private static final String API_URL = "https://gutendex.com/books/";

    public static HttpRequest buildRequest(String query) {
        String url = API_URL + "?search=" + query;
        return HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
    }
}