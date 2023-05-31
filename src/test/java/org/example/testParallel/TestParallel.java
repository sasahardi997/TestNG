package org.example.testParallel;

import org.testng.annotations.Test;

public class TestParallel {

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void testMethod1() {
        System.out.println("Test Parallel >> testMethod1 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Parallel >> testMethod2 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod3() {
        System.out.println("Test Parallel >> testMethod3 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod4() {
        System.out.println("Test Parallel >> testMethod4 >> " + Thread.currentThread().getId());
    }
}
