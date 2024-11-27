package WeeklyTasks;

import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberOfDigits = 0;
        int temp = n;

         do {
             numberOfDigits++;
             temp /= 10;
         } while (temp > 0);

        System.out.println(numberOfDigits);
    }
}
