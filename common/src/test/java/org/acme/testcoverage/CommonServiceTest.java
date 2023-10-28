package org.acme.testcoverage;

import org.junit.jupiter.api.Test;

public class CommonServiceTest {

    @Test
    public void testGreetingService() {
    // Shouldn't CommonService already be covered by org.acme.testcoverage.GreetingServiceTest (????)
        CommonService commonService = new CommonService();
        commonService.greeting("bla");
    }
}