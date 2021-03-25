package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SeasonApp {
    public static void main(String[] args) throws IOException {
        Season season;
        System.out.println("Enter any month: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        String currentMonth = s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();



        switch (currentMonth) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println("The current season is: " + season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println("The current season is: " + season);
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                System.out.println("The current season is: " + season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println("The current season is: " + season);
                break;
            default:
                System.out.println("No this month");
        }

    }
}
