package com.aluracursos.literalura;

import com.aluracursos.literalura.model.BookResponse;
import com.aluracursos.literalura.service.BookService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        System.out.print("Ingrese el título del libro que desea buscar: ");
        String query = scanner.nextLine();

        try {
            BookResponse bookResponse = bookService.getBooks(query);
            bookService.displayBooks(bookResponse);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al obtener los libros: " + e.getMessage());
        }
    }
}
