package org.example.demoTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class DemoTestIgnore {

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }
}
