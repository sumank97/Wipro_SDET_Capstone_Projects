package testcases;

import java.io.File;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadPage;

public class UploadTest extends BaseTest {

    @Test
    public void uploadFileTest() throws Exception {

        UploadPage upload =
                new UploadPage(driver);

        String filePath =
                System.getProperty("user.dir")
                + "\\src\\test\\resources\\testdata\\TestData1.xlsx";

        File file = new File(filePath);

        if (!file.exists()) {
            throw new RuntimeException(
                    "File not found: " + filePath);
        }

        upload.uploadFile(filePath);

        System.out.println("Upload Test Passed");
    }
}