package JavaTasks;

import java.util.Scanner;


public class NumberCheckApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("The number is negative.");
        }else if(number > 0){
            System.out.println("The number is positive.");
        }else {
            System.out.println("The number iz zero.");
        }

        if(number % 2 == 0){
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }

    }
}