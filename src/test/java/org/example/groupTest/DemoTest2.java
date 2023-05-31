package org.example.groupTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTest2 {

    @Test(groups = {"smoke", "functional"})
    public void test4() {
        System.out.println("Some, functional");
    }

    @Test(groups = {"smoke", "regression"})
    public void test5() {
        System.out.println("Smoke, regression");
    }

    @Test
    public void test6() {
        System.out.println("Without groups");
    }
}
