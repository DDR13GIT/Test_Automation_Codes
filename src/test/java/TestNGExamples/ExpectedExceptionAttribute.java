package TestNGExamples;

import org.testng.annotations.Test;

public class ExpectedExceptionAttribute {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testMethod() {
        int i = 1 / 0;
        System.out.println("This test method is expected to throw an ArithmeticException");
    }

    @Test
    public void testMethod2() {
        int i = 1 / 1;
        System.out.println("This test method is expected to throw an ArithmeticException");
    }
}