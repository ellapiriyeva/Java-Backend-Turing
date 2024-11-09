package JavaTasks;

import java.util.Scanner;

public class ReverseAndUpperCase {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String str1 = str.toUpperCase();

        for(int i = str1.length() - 1 ; i >= 0 ; i--){
            System.out.print(str1.charAt(i));
        }
    }
}