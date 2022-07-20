package questions.firstJava;

import java.util.Scanner;

/**
 * Check if given string is palindrome or not
 */
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");

        String s = scanner.next();
        StringBuilder sb = new StringBuilder(s);
        String rev = String.valueOf(sb.reverse());

        if (s.equals(rev)) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is not Palindrome");
        }

        //Method2
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse)) {
            System.out.println("Given string is Palindrome");
        } else {
            System.out.println("Given string is not Palindrome");
        }

    }
}
