package homework11.utils;

import java.io.File;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Screenshot {
    @Attachment(type = "image/png")
    public static byte[] screenshot(WebDriver driver) throws IOException {
        try {
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screen, new File("target/screenshot/" + System.currentTimeMillis() + ".png"));
            return Files.toByteArray(screen);
        } catch (IOException e) {
            return null;
        }
    }
}