package org.acme.testcoverage.service2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService2 {

    public String greeting(String name) {
        return "hello " + name;
    }

}