package homework10;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SimpleTest {

    @BeforeMethod
    public void preconditions() {
        System.out.println("Start something");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Stop something");
    }

    @Test
    public void firstTest() {
        System.out.println("my first test");
    }

    @Test
    public void secondTest() {
        System.out.println("my second test");
    }
}
