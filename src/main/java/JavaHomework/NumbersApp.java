package JavaHomework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class NumbersApp {

    public static void main (String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let the game begin!");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        int[] guesses = new int[100];
        int guessCount = 0;

        while (true) {
            System.out.print("Enter your guess: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            int guess = scanner.nextInt();

            guesses[guessCount++] = guess;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.print("Your guesses: ");

        Arrays.sort(guesses, 0, guessCount);

        for(int i = guessCount - 1; i >= 0; i--){
            System.out.print(guesses[i] + " ");
        }
    }
}