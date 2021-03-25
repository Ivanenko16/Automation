package homework9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    private static WebDriver driver = null;

    public static WebDriver driver (){
        if (driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }
}
