package homework7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int count;
        int num1 = 0;
        int num2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for the Fibonacci sequence");
        count = scanner.nextInt();
        System.out.print("Fibonacci sequence of " + count + " numbers: ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
