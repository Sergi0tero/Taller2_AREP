package org.example.Services;

import org.example.RESTService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Servicio que retorna la pantalla de error
 */
public class Error404 implements RESTService {

    /**
     * Header de la pagina de error
     * @return String con el header del archivo
     */
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/html\r\n" +
                "\r\n";
    }


    /**
     * Header de la pagina de error
     * @return String con el cuerpo del archivo
     */
    @Override
    public String getResponse() throws IOException {
        Path file = Paths.get("src/main/resources/error404.html");
        byte[] fileArray = Files.readAllBytes(file);

        return new String(fileArray);
    }
}
