package tests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ParaBankTest extends BaseTest {

    @Test
    public void registerAndLoginTest() throws Exception {

        String username =
                "user" + UUID.randomUUID().toString().substring(0, 5);

        String password = "admin123";

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Click Register
        driver.findElement(By.linkText("Register")).click();

        // Registration Form
        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Suman");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Kumar");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Bangalore");

        driver.findElement(By.id("customer.address.city"))
                .sendKeys("Bangalore");

        driver.findElement(By.id("customer.address.state"))
                .sendKeys("Karnataka");

        driver.findElement(By.id("customer.address.zipCode"))
                .sendKeys("560001");

        driver.findElement(By.id("customer.phoneNumber"))
                .sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn"))
                .sendKeys("12345");

        driver.findElement(By.id("customer.username"))
                .sendKeys(username);

        driver.findElement(By.id("customer.password"))
                .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Register']"))
                .click();

        // Validation
        String pageSource = driver.getPageSource();

        Assert.assertTrue(
                pageSource.contains("Welcome")
                        || pageSource.contains(username));

        System.out.println("Username = " + username);
        System.out.println("Registration Successful");

        // Logout
        driver.findElement(By.linkText("Log Out")).click();

        System.out.println("Logout Successful");

        Thread.sleep(3000);

        // Verify Login Page
        boolean loginPageDisplayed =
                driver.findElement(By.name("username"))
                        .isDisplayed();

        Assert.assertTrue(loginPageDisplayed);

        System.out.println("Returned To Login Page Successfully");

        System.out.println("TEST PASSED");
    }
}