package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GUIElementsPage {

    WebDriver driver;

    public GUIElementsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterName(String name) {

        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void enterEmail(String email) {

        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void enterPhone(String phone) {

        driver.findElement(By.id("phone")).sendKeys(phone);
    }

    public void enterAddress(String address) {

        driver.findElement(By.id("textarea")).sendKeys(address);
    }

    public void selectGender() {

        driver.findElement(
                By.xpath("//input[@value='male']"))
                .click();
    }

    public void selectDays() {

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("tuesday")).click();
        driver.findElement(By.id("friday")).click();
    }

    public void selectCountry() {

        Select country =
                new Select(driver.findElement(By.id("country")));

        country.selectByVisibleText("India");
    }

    public void selectColor() {

        Select color =
                new Select(driver.findElement(By.id("colors")));

        color.selectByVisibleText("Blue");
    }

    public void selectAnimal() {

        Select animal =
                new Select(driver.findElement(By.id("animals")));

        animal.selectByVisibleText("Cat");
    }

    public void selectDate() {

        driver.findElement(By.id("datepicker"))
                .sendKeys("06/06/2026");
    }

    public void uploadFile(String path) {

        driver.findElement(By.id("singleFileInput"))
                .sendKeys(path);
    }

    public void mouseHover() {

        try {

            WebElement hover =
                    driver.findElement(
                    By.xpath("//button[contains(text(),'Point Me')]"));

            Actions act = new Actions(driver);

            act.moveToElement(hover).perform();

            System.out.println("Mouse Hover Successful");

        } catch(Exception e) {

            System.out.println("Mouse Hover Not Available");
        }
    }

    public void doubleClick() {

        try {

            WebElement btn =
                    driver.findElement(
                    By.xpath("//button[contains(text(),'Copy Text')]"));

            Actions act = new Actions(driver);

            act.doubleClick(btn).perform();

            System.out.println("Double Click Successful");

        } catch(Exception e) {

            System.out.println("Double Click Not Available");
        }
    }

    public void dragAndDrop() {

        try {

            WebElement source =
                    driver.findElement(By.id("draggable"));

            WebElement target =
                    driver.findElement(By.id("droppable"));

            Actions act = new Actions(driver);

            act.dragAndDrop(source, target).perform();

            System.out.println("Drag Drop Successful");

        } catch(Exception e) {

            System.out.println("Drag Drop Not Available");
        }
    }

    public void handleAlert() {

        try {

            driver.findElement(
                    By.xpath("//button[contains(text(),'Alert')]"))
                    .click();

            Alert alert = driver.switchTo().alert();

            System.out.println(alert.getText());

            alert.accept();

            System.out.println("Alert Handled");

        } catch(Exception e) {

            System.out.println("Alert Not Available");
        }
    }
}