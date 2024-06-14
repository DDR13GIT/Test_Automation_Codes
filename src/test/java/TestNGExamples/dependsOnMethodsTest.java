package TestNGExamples;

import org.testng.annotations.Test;

public class dependsOnMethodsTest {

    @Test
    public void login() {
        System.out.println("Logging in....");
    }

    @Test(dependsOnMethods = {"login"})
    public void performAction() {
        System.out.println("Give Like to a post");

    }

    @Test(dependsOnMethods = {"performAction"})
    public void logout() {
        System.out.println("Logging out....");
        // Add your logout code here
    }
}