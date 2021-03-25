package homework10;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithParametersDataProvider {

    @Test(dataProvider = "NumbersProvider")
    public void Sum(int v1, int v2) {
        int sum = v1 + v2;
        System.out.println("Sum = " + sum);
    }
    @DataProvider(name = "NumbersProvider")
    public Object[][] getDataFromDataProvider() {
        return new Object[][]
                {
                        {10, 12},
                        {123, 123},
                        {34, 34},
                        {55, 55}
                };
    }
}
