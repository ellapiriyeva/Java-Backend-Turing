package Exception;

import java.util.Scanner;

public class AgeStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[50];
        int count = 0;

        System.out.println("Enter ages (type 'stop' or 'exit' to finish):");
        while (count < 50) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);

                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative.");
                } else if (age > 200) {
                    throw new ArithmeticException("Age is too large.");
                }

                ages[count++] = age;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Entered Ages:");
        for (int i = 0; i < count; i++) {
            System.out.print(ages[i] + (i < count - 1 ? ", " : "\n"));
        }

        for (int i = 0; i < count; i++) {
            try {
                long factorial = calculateFactorial(ages[i]);
                System.out.println("- Age: " + ages[i] + " -> Factorial: " + factorial + ", " + (isEven(ages[i]) ? "Even" : "Odd") + ".");
            } catch (Exception e) {
                System.out.println("- Age: " + ages[i] + " -> Factorial too large to calculate, " + (isEven(ages[i]) ? "Even" : "Odd") + ".");
            }
        }

        getStatistics(ages, count);
        scanner.close();
    }

    public static long calculateFactorial(int age) throws Exception {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative for factorial calculation.");
        }
        long factorial = 1;
        for (int i = 1; i <= age; i++) {
            factorial = Math.multiplyExact(factorial, i);
        }
        return factorial;
    }

    public static boolean isEven(int age) {
        return age % 2 == 0;
    }

    public static void getStatistics(int[] ages, int count) {
        int total = count;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ages[i];
        }
        double average = total > 0 ? (double) sum / total : 0;

        int children = 0, teenagers = 0, adults = 0, seniors = 0;

        for (int i = 0; i < count; i++) {
            if (ages[i] <= 12) children++;
            else if (ages[i] <= 19)
                teenagers++;
            else if (ages[i] <= 64)
                adults++;
            else
                seniors++;
        }

        System.out.println("\nStatistical Summary:");
        System.out.println("- Total number of people: " + total);
        System.out.println("- Sum of ages: " + sum);
        System.out.println("- Average age: " + average);
        System.out.println("- Age Group Statistics:");
        System.out.println("  * Children: " + children + " person(s)");
        System.out.println("  * Teenagers: " + teenagers + " person(s)");
        System.out.println("  * Adults: " + adults + " person(s)");
        System.out.println("  * Seniors: " + seniors + " person(s)");
    }
}
