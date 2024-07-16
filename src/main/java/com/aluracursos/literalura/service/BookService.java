package com.aluracursos.literalura.service;

import com.aluracursos.literalura.client.BookApiClient;
import com.aluracursos.literalura.client.HttpClientUtil;
import com.aluracursos.literalura.model.BookResponse;
import com.aluracursos.literalura.util.JacksonJsonParser;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BookService {
    public BookResponse getBooks(String query) throws IOException, InterruptedException {
        HttpRequest request = BookApiClient.buildRequest(query);
        HttpResponse<String> response = HttpClientUtil.getHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return JacksonJsonParser.parseBookResponse(response.body());
    }
}
