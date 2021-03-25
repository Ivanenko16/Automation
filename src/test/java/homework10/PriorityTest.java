package homework10;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 3)
    public void firstTest() {
        System.out.println("my first test");
    }

    @Test(priority = 2)
    public void secondTest() {
        System.out.println("my second test");
    }

    @Test(priority = 1)
    public void thirdTest() {
        System.out.println("my third test");
    }

}
