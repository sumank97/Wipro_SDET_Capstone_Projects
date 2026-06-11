package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FormPage;
import utilities.ExcelUtils;

public class FormTest extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(FormTest.class);

    @Test
    public void fillFormTest() throws Exception {

        logger.info("Form Test Started");

        FormPage form = new FormPage(driver);

        String excelPath =
                System.getProperty("user.dir")
                + "\\src\\test\\resources\\testdata\\TestData1.xlsx";

        String name = ExcelUtils.getCellData(excelPath, 1, 0);
        String email = ExcelUtils.getCellData(excelPath, 1, 1);
        String phone = ExcelUtils.getCellData(excelPath, 1, 2);
        String address = ExcelUtils.getCellData(excelPath, 1, 3);

        logger.info("Excel Data Read Successfully");

        form.enterName(name);
        form.enterEmail(email);
        form.enterPhone(phone);
        form.enterAddress(address);

        form.selectGender();
        form.selectDays();
        form.selectCountry("India");
        form.selectColor();
        form.selectAnimal();

        form.enterDatePicker1();
        form.enterDatePicker2();

        form.clickSubmit();

        Assert.assertTrue(
                driver.getTitle().contains("Automation"));

        logger.info("Form Test Passed Successfully");
    }
}