package org.example.Services;

import org.example.RESTService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CssService implements RESTService {

    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/css\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() throws IOException {
        Path file = Paths.get("src/main/resources/prueba.css");
        byte[] fileArray = Files.readAllBytes(file);

        return new String(fileArray);
    }
}
