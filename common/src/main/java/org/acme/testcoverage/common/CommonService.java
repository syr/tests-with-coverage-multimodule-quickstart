package org.acme.testcoverage.common;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommonService {

    public String greeting(String name) {
        return "hello " + name;
    }

}