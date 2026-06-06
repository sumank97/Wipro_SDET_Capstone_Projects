package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ConfirmationPage;
import pages.FlightSelectionPage;
import pages.HomePage;
import pages.PurchasePage;

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlightTest() throws Exception {

        HomePage home = new HomePage(driver);

        home.selectDepartureCity();
        System.out.println("Departure City Selected");

        home.selectDestinationCity();
        System.out.println("Destination City Selected");

        home.clickFindFlights();
        System.out.println("Find Flights Clicked");

        FlightSelectionPage flight =
                new FlightSelectionPage(driver);

        Assert.assertTrue(
                flight.verifyFlightsDisplayed());

        System.out.println("Flights Displayed");

        flight.chooseFlight();

        System.out.println("Flight Selected");

        PurchasePage purchase =
                new PurchasePage(driver);

        Assert.assertTrue(
                purchase.verifyPurchasePage());

        System.out.println("Purchase Page Displayed");

        purchase.enterPassengerDetails();

        System.out.println("Passenger Details Entered");

        purchase.purchaseFlight();

        System.out.println("Purchase Flight Clicked");

        ConfirmationPage confirm =
                new ConfirmationPage(driver);

        String msg =
                confirm.getConfirmationMessage();

        System.out.println("Message = " + msg);

        Assert.assertEquals(
                msg,
                "Thank you for your purchase today!");

        System.out.println(
                "FLIGHT BOOKING COMPLETED SUCCESSFULLY");
    }
}