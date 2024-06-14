package TestNGExamples;

import org.testng.annotations.Test;

public class timeoutAttribute {

    @Test(timeOut = 1000) // time in milliseconds
    public void testMethod() {
        int i = 0;
        while (true) {
            System.out.println("This test method will run indefinitely until it times out:   " + i++);
        }

    }
}