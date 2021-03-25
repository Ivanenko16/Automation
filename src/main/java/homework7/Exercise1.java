package homework7;

public class Exercise1 {
    public static void main(String[] args) {
        int i;


        System.out.println("Exercise 1");

        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                i++;
                System.out.print("Five" + " ");
            }
            if (i == 7) {
                i++;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Exercise 1.2");

        for (i = 20; i >= 1; i--) {
            if (i == 5) {
                i--;
                System.out.print("Five" + " ");
            }
            if (i == 7) {
                i--;
            }
            System.out.print(i + " ");
        }
    }
}
