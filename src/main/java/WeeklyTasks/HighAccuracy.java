package WeeklyTasks;

import java.util.Scanner;

public class HighAccuracy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(n / m);
        int remainder = n % m;

        if (k > 0) {
            System.out.print(".");
            for (int i = 0; i < k; i++) {
                remainder *= 10;
                System.out.print(remainder / m);
                remainder %= m;
            }
        }
        System.out.println();
    }
}

