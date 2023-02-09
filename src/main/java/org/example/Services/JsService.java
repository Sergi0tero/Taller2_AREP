package org.example.Services;

import org.example.RESTService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class JsService implements RESTService {
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: application/javascript\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() throws IOException {
        Path file = Paths.get("src/main/resources/prueba.js");
        byte[] fileArray = Files.readAllBytes(file);

        return new String(fileArray);
    }
}
