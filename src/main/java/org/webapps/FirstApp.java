package org.webapps;

import org.example.HttpServer;
import org.example.Services.*;

import java.io.IOException;

public class FirstApp {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.getInstance();
        server.addService("/html", new HTMLService());
        server.addService("/js", new JsService());
        server.addService("/img", new IMGService());
        server.addService("/css", new CssService());
        server.addService("/404", new Error404());
        server.run(args);
    }
}
