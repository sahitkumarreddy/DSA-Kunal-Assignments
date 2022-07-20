package questions.firstJava;

import java.util.Scanner;

/**
 * Check if given number belongs to fibonacci series or not
 */
public class CheckFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        while (c < n){
            c = a +b;
            a = b;
            b = c;
        }

        if(c == n){
            System.out.println("Number belongs to fibonacci series");
        }else {
            System.out.println("Number doesnot belong to fibonacci series");
        }
    }
}
