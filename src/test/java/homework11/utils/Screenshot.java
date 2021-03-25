package homework11.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public  class Screenshot {

        public static void takeScreenshot(WebDriver driver) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File( "target/screenshot/" + System.currentTimeMillis() + ".png"));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

