package JavaHomework;

import java.util.Scanner;
import java.util.Random;

public class ShootingAtTheSquare {

    public static void main(String[] args){

        char[][] square = new char[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                square[i][j] = '-';
            }
        }
        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);

        Scanner scanner = new Scanner(System.in);
        while(true){
            int row = 0;
            while(true) {
                System.out.print("Enter a row to fire (1-5): ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (row >= 1 && row <= 5) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            int column = 0;
            while(true){
                System.out.print("Enter a column to fire (1-5): ");
                if(scanner.hasNextInt()){
                    column = scanner.nextInt();
                    if(column >= 1 && column <= 5) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }

            if(row - 1 == targetRow && column - 1 == targetColumn) {
                square[targetRow][targetColumn] = 'x';
                printSquare(square);

                System.out.println("You have won!");
                break;
            }
            if (square[row - 1][column - 1] == '*') {
                System.out.println("You already fired at this position!");
            } else {
                square[row - 1][column - 1] = '*';
                printSquare(square);
            }
        }
    }
    public static void printSquare(char[][] square) {
        System.out.println("Current square: ");
        for(int i = 0; i < square.length; i++){
            for(int j = 0 ; j < square[i].length; j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}