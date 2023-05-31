package org.example.dependencies;

import org.testng.annotations.Test;

public class TestGroupDependency {

    @Test(groups = "smoke")
    public void test1() {
        System.out.println("smoke");
    }

    @Test(groups = "smoke")
    public void test2() throws Exception {
        System.out.println("smoke");
    }

    @Test(groups = "smoke")
    public void test3() {
        System.out.println("smoke");
    }

    @Test(groups = "smoke")
    public void test4() {
        System.out.println("smoke");
    }

    @Test(groups = "sanity")
    public void test5() throws Exception {
        System.out.println("sanity");
    }

    @Test(groups = "regression")
    public void test6() {
        System.out.println("regression");
    }

    @Test(dependsOnGroups = {"sanity"})
    public void main() {
        System.out.println("main test");
    }
}
