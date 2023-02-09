package org.example.Services;

import org.example.RESTService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Error404 implements RESTService {
    @Override
    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: text/html\r\n" +
                "\r\n";
    }

    @Override
    public String getResponse() throws IOException {
        Path file = Paths.get("src/main/resources/error404.html");
        byte[] fileArray = Files.readAllBytes(file);

        return new String(fileArray);
    }
}