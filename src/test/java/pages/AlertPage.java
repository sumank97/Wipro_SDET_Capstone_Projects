package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    By alertButton = By.id("alertBtn");

    public void handleAlert() throws Exception {

        driver.findElement(alertButton).click();

        // Keep alert visible for demo purpose
        Thread.sleep(3000);

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        Alert alert =
                wait.until(
                        ExpectedConditions.alertIsPresent());

        System.out.println(
                "Alert Text : " + alert.getText());

        // Additional visibility before accepting
        Thread.sleep(3000);

        alert.accept();

        System.out.println(
                "Alert Accepted Successfully");
    }
}