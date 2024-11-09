package Array;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args){
        int[] num = new int[6];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            num[i] = scan.nextInt();
        }
        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
