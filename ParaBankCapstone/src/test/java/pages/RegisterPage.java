package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    public void registerUser(String username,String password) {

        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Suman");

        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Kumar");

        driver.findElement(By.id("customer.address.street"))
              .sendKeys("Mysore");

        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Mysore");

        driver.findElement(By.id("customer.address.state"))
              .sendKeys("Karnataka");

        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("570001");

        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("9876543210");

        driver.findElement(By.id("customer.ssn"))
              .sendKeys("123456");

        driver.findElement(By.id("customer.username"))
              .sendKeys(username);

        driver.findElement(By.id("customer.password"))
              .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
              .sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();
    }
}