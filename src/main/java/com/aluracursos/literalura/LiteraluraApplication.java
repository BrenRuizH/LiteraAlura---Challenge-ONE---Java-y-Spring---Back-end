package com.aluracursos.literalura;

import com.aluracursos.literalura.model.BookResponse;
import com.aluracursos.literalura.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		displayMenu();
	}

	private void displayMenu() {
		Scanner scanner = new Scanner(System.in);
		BookService bookService = new BookService();
		boolean exit = false;

		while (!exit) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Buscar libros por título");
			System.out.println("2. Salir");

			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
				case 1:
					System.out.print("Ingrese el título del libro que desea buscar: ");
					String query = scanner.nextLine();
					try {
						BookResponse bookResponse = bookService.getBooks(query);
						if (bookResponse.getCount() > 0) {
							bookService.displayBooks(bookResponse);
						} else {
							System.out.println("No se encontraron libros para el título proporcionado.");
						}
					} catch (IOException | InterruptedException e) {
						System.err.println("Error al obtener los libros: " + e.getMessage());
					}
					break;
				case 2:
					exit = true;
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
			}
		}

		scanner.close();
	}
}
