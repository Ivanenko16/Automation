package homework10;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsDependencies {
    @BeforeMethod
    public void preconditions() {
        System.out.println("Start something");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Stop something");
    }

    @Test(groups = {"group1"})
    public void firstTest() {
        System.out.println("my first test");
    }

    @Test(groups = {"group1"})
    public void secondTest() {
        System.out.println("my second test");
    }

    @Test()
    public void thirdTest() {
        System.out.println("my third test");
    }

    @Test()
    public void fourthTest() {
        System.out.println("my fourth test");
    }
}

