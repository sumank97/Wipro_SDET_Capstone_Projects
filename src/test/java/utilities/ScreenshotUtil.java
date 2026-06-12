package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(
            WebDriver driver,
            String fileName) {

        String path =
                System.getProperty("user.dir")
                + "\\screenshots\\"
                + fileName + ".png";
        /*Thread.sleep(2000);

    	String screenshotPath =
    	        ScreenshotUtil.captureScreenshot(
    	                driver,
    	                result.getName());*/

        try {

            File src =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.FILE);

            File dest = new File(path);

            dest.getParentFile().mkdirs();

            FileUtils.copyFile(src, dest);

            System.out.println(
                    "Screenshot saved: " + path);

        } catch (IOException e) {

            e.printStackTrace();
        }

        return path;
    }
}