package TestNGExamples;

import org.testng.annotations.Test;

public class invocationCountAttribute {

    @Test(invocationCount = 100)
    public void testMethod() {
        System.out.println("This test method will be invoked!!@!!");
    }
}