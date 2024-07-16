package com.aluracursos.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookResponse {
    private int count;
    private List<Book> results;

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("results")
    public List<Book> getResults() {
        return results;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Book {
        private String title;
        private List<String> authors;

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("authors")
        public List<String> getAuthors() {
            return authors;
        }
    }
}
