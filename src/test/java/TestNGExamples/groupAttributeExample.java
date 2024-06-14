package TestNGExamples;

import org.testng.annotations.Test;

public class groupAttributeExample {

    @Test(groups = {"sanity"})
    public void test1() {
        System.out.println("This is a sanity test");
    }

    @Test(groups = {"sanity", "regression"})
    public void test2() {
        System.out.println("This is a sanity and regression test");
    }

    @Test(groups = {"regression"})
    public void test3() {
        System.out.println("This is a regression test");
    }
}