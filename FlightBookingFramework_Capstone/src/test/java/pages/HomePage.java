package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectDepartureCity() {

        Select fromPort =
                new Select(driver.findElement(By.name("fromPort")));

        fromPort.selectByVisibleText("Boston");
    }

    public void selectDestinationCity() {

        Select toPort =
                new Select(driver.findElement(By.name("toPort")));

        toPort.selectByVisibleText("London");
    }

    public void clickFindFlights() {

        driver.findElement(
                By.xpath("//input[@value='Find Flights']"))
                .click();
    }
}