package JavaTasks;

import java.util.Scanner;

public class VowelOrNot {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char ch = Character.toLowerCase(str.charAt(str.length() - 1));

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The last character is vowel.");
        } else {
            System.out.println("The last character is not vowel.");
        }
    }
}
