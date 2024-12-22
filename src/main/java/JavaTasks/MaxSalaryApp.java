package JavaTasks;

import java.util.Scanner;

public class MaxSalaryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary;
        double maxSalary = -1;
        while (scanner.hasNext()) {
            salary = scanner.nextDouble();
            if(maxSalary < salary) {
                maxSalary = salary;
            }
        }
        System.out.printf("%.2f" , maxSalary);
    }
}
