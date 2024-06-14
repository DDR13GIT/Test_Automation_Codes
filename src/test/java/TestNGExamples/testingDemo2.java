package TestNGExamples;

import org.testng.annotations.*;

public class testingDemo2 {

//Preconditions for the test

    @BeforeSuite
    public void setupSuite() {
        System.out.println("Setup chrome driver and webdriver....");
    }

    @BeforeTest
    public void setupTest() {
        System.out.println("Open the browser and navigate to the website....");
        System.out.println("maximize the browser....");
    }

    @BeforeMethod
    public void beforeMethod() {
        // Clear the username and password fields before each test
        System.out.println("Clear the username and password fields before each test....");
    }

    // Test cases
    @Test
    public void testValidLogin() {
        System.out.println("Enter a valid username and password and click the login button....");
    }

    @Test
    public void testInvalidLogin() {
        System.out.println("Enter an invalid username and password and click the login button....");
    }

    //Post conditions for the test

    @AfterMethod
    public void afterMethod() {
        System.out.println("logout....");
    }

    @AfterTest
    public void teardownTest() {
        System.out.println("Close the browser....");
    }
}