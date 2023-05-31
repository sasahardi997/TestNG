package org.example.testParallel;

import org.testng.annotations.Test;

public class TestParallel3 {

    @Test
    public void testMethod8() {
        System.out.println("Test Parallel3 >> testMethod8 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod9() {
        System.out.println("Test Parallel3 >> testMethod9 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod10() {
        System.out.println("Test Parallel3 >> testMethod10 >> " + Thread.currentThread().getId());
    }

    @Test
    public void testMethod11() {
        System.out.println("Test Parallel3 >> testMethod11 >> " + Thread.currentThread().getId());
    }
}
