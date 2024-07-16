Claro, aquí tienes un ejemplo de README para tu proyecto LiterAlura:

---

# LiterAlura

LiterAlura es un proyecto de catálogo de libros y autores utilizando la API de Gutendex. Este proyecto está desarrollado con Java y Spring Boot, utilizando PostgreSQL como base de datos para almacenar la información de los libros y autores.

## Requisitos

- Java 11 o superior
- Maven
- PostgreSQL

## Configuración del Proyecto

1. **Clonar el repositorio**

   ```bash
   git clone https://github.com/BrenRuizH/LiteraAlura---Challenge-ONE---Java-y-Spring---Back-end.git
   cd literalura
   ```

2. **Configurar la base de datos**

   Crea una base de datos en PostgreSQL. Por ejemplo, puedes crear una base de datos llamada `literalura`.

   ```sql
   CREATE DATABASE literalura_db;
   ```

3. **Configurar las propiedades de la aplicación**

   Edita el archivo `src/main/resources/application.properties` y configura las propiedades de la base de datos.

   ```properties
   # Configuración de la base de datos PostgreSQL
   spring.datasource.url=jdbc:postgresql://localhost:5432/literalura_db
   spring.datasource.username=tu-usuario
   spring.datasource.password=tu-contraseña
   spring.datasource.driver-class-name=org.postgresql.Driver
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

   # Configuración de Hibernate
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Compilar y ejecutar la aplicación**

   Utiliza Maven para compilar y ejecutar la aplicación.

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Uso

Al iniciar la aplicación, se presentará un menú en la consola con las siguientes opciones:

1. **Buscar libro por título**

   Permite buscar un libro por su título en la API de Gutendex y guarda el primer resultado en la base de datos.

2. **Buscar autor por nombre**

   Permite buscar un autor por su nombre en la API de Gutendex y guarda el primer resultado en la base de datos.

3. **Mostrar libros registrados**

   Permite contar y mostrar los libros almacenados en la base de datos.

4. **Mostrar autores registrados**

   Permite contar y mostrar los autores almacenados en la base de datos.

5. **Mostrar autores vivos en un año**

   Permite mostrar los autores que estaban vivos en un año específico.

6. **Mostrar libros por idioma**

   Permite mostrar los libros almacenados en la base de datos por un idioma específico.



7. **Salir**

   Salir de la aplicación.

## Dependencias

Incluye las siguientes dependencias en tu archivo `pom.xml`:

```xml
<dependencies>
    <!-- Dependencias de Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- PostgreSQL Driver -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Jackson para el procesamiento de JSON -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
    </dependency>

    <!-- Spring Boot Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

