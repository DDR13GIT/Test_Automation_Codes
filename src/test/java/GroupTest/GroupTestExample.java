package GroupTest;

import org.testng.annotations.Test;

public class GroupTestExample {

    @Test(groups = {"login"})
    public void testLogin() {
        System.out.println("Login test");
    }

    @Test(groups = {"login"})
    public void testLoginWithInvalidCredentials() {
        System.out.println("Login with invalid credentials test");
    }

    @Test(groups = {"logout"})
    public void testLogout() {
        System.out.println("Logout test");
    }

    @Test(groups = {"logout"})
    public void testLogoutWithoutLogin() {
        System.out.println("Logout without login test");
    }
}

