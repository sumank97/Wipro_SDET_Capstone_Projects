package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSelectionPage {

    WebDriver driver;

    public FlightSelectionPage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean verifyFlightsDisplayed() {

        return driver.getPageSource()
                .contains("Flights from Boston to London");
    }

    public void chooseFlight() {

        driver.findElement(
                By.xpath("(//input[@value='Choose This Flight'])[1]"))
                .click();
    }
}