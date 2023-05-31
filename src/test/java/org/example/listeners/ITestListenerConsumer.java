package org.example.listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//We can also implement from xml
//@Listeners(ITestListenerClass.class)
public class ITestListenerConsumer {

    @Test
    void method1() {
        System.out.println("method from consumer");
    }
}
