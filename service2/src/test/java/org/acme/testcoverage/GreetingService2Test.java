package org.acme.testcoverage;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.acme.testcoverage.common.CommonService;
import org.acme.testcoverage.service2.GreetingService2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingService2Test {
    @Inject
    GreetingService2 service;

    @Inject
    CommonService commonService;

    @Test
    public void testGreetingService() {
        Assertions.assertEquals("hello Quarkus", service.greeting("Quarkus"));
        commonService.greeting("bla");
    }
}