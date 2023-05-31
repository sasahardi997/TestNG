package org.example.test;

import org.testng.annotations.Test;

public class FlightBookingTest {

    @Test
    public void signup() {
        System.out.println("Sign up");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Login");
    }

    @Test(priority = 3)
    public void searchForTheFlight() {
        System.out.println("Search for the flight");
    }

    @Test(priority = 4)
    public void bookTheFlight() {
        System.out.println("Book the flight");
    }

    @Test(priority = 5)
    public void saveTheTicket() {
        System.out.println("Save the ticket");
    }

    @Test(priority = 6)
    public void logout() {
        System.out.println("Logout");
    }

}
