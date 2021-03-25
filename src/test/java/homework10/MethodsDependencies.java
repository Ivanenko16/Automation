package homework10;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodsDependencies {

    @BeforeMethod
    public void preconditions() {
        System.out.println("Start something");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Stop something");
    }

    @Test()
    @Severity(SeverityLevel.BLOCKER)
    public void firstTest() {
        System.out.println("my first test");
        Assert.fail("I am failed");
    }

    @Test()
    public void secondTest() {
        System.out.println("my second test");
    }

    @Test(dependsOnMethods = "firstTest")
    public void thirdTest() {
        System.out.println("my third test");
    }

    @Test(dependsOnMethods = "thirdTest")
    public void fourthTest() {
        System.out.println("my fourth test");
    }
}
