package JavaTasks;

import java.util.Scanner;

public class MaxSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of workers (2 or more): ");
        int workers = scanner.nextInt();

        if (workers < 2) {
            System.out.println("The number of workers must be 2 or more.");
            return;
        }

        double[] salaries = new double[workers];

        for (int i = 0; i < workers; i++) {
            System.out.println("Enter salary for worker " + (i + 1) + ": ");
            salaries[i] = scanner.nextDouble();
        }

        double maxSalary = findMaxSalary(salaries);
        System.out.println("The maximum salary is: " + maxSalary);
    }

    public static double findMaxSalary(double[] salaries) {
        double max = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
        }
        return max;
    }
}
