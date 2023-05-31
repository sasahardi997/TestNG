package org.example.demoTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTestIgnore2 {

    @Test
    public void test4() {
        System.out.println("Test 4");
    }

    @Ignore
    @Test
    public void test5() {
        System.out.println("Test 5");
    }

    @Test
    public void test6() {
        System.out.println("Test 6");
    }
}
