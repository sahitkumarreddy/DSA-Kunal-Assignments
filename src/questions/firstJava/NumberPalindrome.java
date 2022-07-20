package questions.firstJava;

import java.util.Scanner;

/**
 * Check if given number is palindrome or not
 */
public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        int orgNum = num;
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }

        if (orgNum == revNum) {
            System.out.println("Given number is Palindrome");
        } else {
            System.out.println("Given number is not Palindrome");
        }
    }
}
