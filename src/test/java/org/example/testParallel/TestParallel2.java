package org.example.testParallel;

import org.testng.annotations.Test;

public class TestParallel2 {

    @Test
    public void testMethod5() {
        System.out.println("Test Parallel2 >> testMethod5 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod6() {
        System.out.println("Test Parallel2 >> testMethod6 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod7() {
        System.out.println("Test Parallel2 >> testMethod7 >> " + Thread.currentThread().getId());
    }
}
