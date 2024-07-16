package com.aluracursos.literalura.util;

import com.aluracursos.literalura.model.BookResponse;
import com.google.gson.Gson;

public class JsonParser {
    private static final Gson gson = new Gson();

    public static BookResponse parseBookResponse(String jsonResponse) {
        return gson.fromJson(jsonResponse, BookResponse.class);
    }
}