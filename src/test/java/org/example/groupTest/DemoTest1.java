package org.example.groupTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Test(groups = {"All from DemoTest1"})
public class DemoTest1 {

    @Test(groups = {"smoke", "windows.smoke"})
    public void test1() {
        System.out.println("Smoke");
    }

    @Test(groups = {"smoke", "functional", "windows.functional"})
    public void test2() {
        System.out.println("Smoke, functional");
    }

    @Test(groups = {"functional", "regression"})
    public void test3() {
        System.out.println("Functional, regression");
    }

    @Test
    public void test4() {
        //Not executed because doesn't belong to any group
        //It's only executed when run group at class level
        System.out.println("Without groups");
    }
}
