package com.aluracursos.literalura.model;

import java.util.List;

public class BookResponse {
    private int count;
    private List<Book> results;

    public int getCount() {
        return count;
    }

    public List<Book> getResults() {
        return results;
    }

    public static class Book {
        private String title;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
