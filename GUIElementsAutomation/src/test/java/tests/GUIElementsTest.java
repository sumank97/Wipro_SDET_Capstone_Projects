package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;
import utils.Constants;

public class GUIElementsTest extends BaseTest {

    @Test
    public void automateGUIElements() throws Exception {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        System.out.println("Step 1");
        page.enterName(Constants.NAME);

        System.out.println("Step 2");
        page.enterEmail(Constants.EMAIL);

        System.out.println("Step 3");
        page.enterPhone(Constants.PHONE);

        System.out.println("Step 4");
        page.enterAddress(Constants.ADDRESS);

        System.out.println("Step 5");
        page.selectGender();

        System.out.println("Step 6");
        page.selectDays();

        System.out.println("Step 7");
        page.selectCountry();

        System.out.println("Step 8");
        page.selectColor();

        System.out.println("Step 9");
        page.selectAnimal();

        System.out.println("Step 10");
        page.selectDate();

        System.out.println("Step 11");
        page.uploadFile(Constants.FILE_PATH);

        Thread.sleep(2000);

        page.mouseHover();

        Thread.sleep(2000);

        page.doubleClick();

        Thread.sleep(2000);

        page.dragAndDrop();

        Thread.sleep(2000);

        page.handleAlert();

        Thread.sleep(3000);

        System.out.println("GUI ELEMENTS TEST PASSED");
    }
}