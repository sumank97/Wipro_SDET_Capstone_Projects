package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Constants;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean verifyPurchasePage() {

        return driver.getTitle()
                .contains("BlazeDemo");
    }

    public void enterPassengerDetails() {

        driver.findElement(By.id("inputName"))
                .sendKeys(Constants.NAME);

        driver.findElement(By.id("address"))
                .sendKeys(Constants.ADDRESS);

        driver.findElement(By.id("city"))
                .sendKeys(Constants.CITY);

        driver.findElement(By.id("state"))
                .sendKeys(Constants.STATE);

        driver.findElement(By.id("zipCode"))
                .sendKeys(Constants.ZIP);

        driver.findElement(By.id("creditCardNumber"))
                .sendKeys(Constants.CARD_NUMBER);

        driver.findElement(By.id("creditCardMonth"))
                .clear();

        driver.findElement(By.id("creditCardMonth"))
                .sendKeys(Constants.CARD_MONTH);

        driver.findElement(By.id("creditCardYear"))
                .clear();

        driver.findElement(By.id("creditCardYear"))
                .sendKeys(Constants.CARD_YEAR);

        driver.findElement(By.id("nameOnCard"))
                .sendKeys(Constants.CARD_NAME);
    }

    public void purchaseFlight() {

        driver.findElement(
                By.xpath("//input[@value='Purchase Flight']"))
                .click();
    }
}