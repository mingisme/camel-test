package org.example;

import org.apache.camel.main.Main;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Main main = new Main(MainApp.class);
        main.configure().withRoutesIncludePattern("routes/*.xml");
        // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
        main.run(args);
    }
}