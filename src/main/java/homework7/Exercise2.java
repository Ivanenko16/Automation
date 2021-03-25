package homework7;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Enter degree");
        int degree = scanner.nextInt();

        int result = 1;

            for (int i = 0; i < degree; ++i){
              result = result * number;
            }

        System.out.println("Result " + result);


    }
}
