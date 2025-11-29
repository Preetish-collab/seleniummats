package org.project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterization {
    @Parameters({"username", "password"})
    @Test
    public void loginTest(String username, String password) {
        System.out.println("Logging in with Username: " + username + " and Password: " + password);
    }
}
