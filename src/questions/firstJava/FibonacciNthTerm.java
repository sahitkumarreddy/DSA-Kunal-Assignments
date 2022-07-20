package questions.firstJava;

import java.util.Scanner;

/**
 * Print fibonacci nth term
 */
public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        int count = 1;
        while (count < n) {
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        System.out.printf("%d term in fibonacci is : %d", n, c);
    }
}
