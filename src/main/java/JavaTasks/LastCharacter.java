package JavaTasks;

import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        char ch = str.charAt(str.length() - 1);

        System.out.println(ch);
    }
}