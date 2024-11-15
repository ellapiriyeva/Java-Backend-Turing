package JavaHomework;

import java.util.Scanner;

public class WeekPlannerApp {

    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to the courses; watch films";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, input the day of the week:");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            boolean day = false;

            if (input.toLowerCase().startsWith("change") || input.toLowerCase().startsWith("reschedule")) {
                String[] parts = input.split("\\s+", 2);
                if (parts.length == 2) {
                    String dayToChange = parts[1].trim();
                    for (int i = 0; i < schedule.length; i++) {
                        if (schedule[i][0] != null && schedule[i][0].equalsIgnoreCase(dayToChange)) {
                            day = true;
                            System.out.print("Please, input new tasks for " + schedule[i][0] + ":");
                            String newTasks = scanner.nextLine();
                            schedule[i][1] = newTasks;
                            System.out.println("Tasks for " + schedule[i][0] + " have been updated.");
                            break;
                        }
                    }
                }
                if (!day) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
                continue;
            }

            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0] != null && schedule[i][0].equalsIgnoreCase(input)) {
                    day = true;
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    break;
                }
            }

            if (!day) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        System.out.println("Goodbye!");
    }
}