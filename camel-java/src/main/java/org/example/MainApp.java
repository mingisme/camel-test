package org.example;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

    public static void main(String[] args) throws Exception {
        try (CamelContext camel = new DefaultCamelContext()) {

            camel.addRoutes(createBasicRoute());

            camel.start();

            Thread.sleep(10_000);

            camel.stop();
        }
    }

    static RouteBuilder createBasicRoute() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("timer:foo")
                        .log("Hello Camel");
            }
        };
    }
}