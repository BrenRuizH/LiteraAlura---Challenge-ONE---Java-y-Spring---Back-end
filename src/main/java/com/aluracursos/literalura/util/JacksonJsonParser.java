package com.aluracursos.literalura.util;

import com.aluracursos.literalura.model.BookResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JacksonJsonParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static BookResponse parseBookResponse(String jsonResponse) throws IOException {
        return objectMapper.readValue(jsonResponse, BookResponse.class);
    }
}
