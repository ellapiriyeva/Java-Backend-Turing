package WeeklyTasks;

import java.util.Scanner;

public class SimpleProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number / 10;
        int b = number % 10;
        System.out.printf("%d %d%n", a, b);
    }
}
