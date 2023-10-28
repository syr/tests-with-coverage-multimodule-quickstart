package org.acme.testcoverage;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommonService {

    public String greeting(String name) {
        return "hello " + name;
    }

}