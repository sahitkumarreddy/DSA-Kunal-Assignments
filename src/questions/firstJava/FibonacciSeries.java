package questions.firstJava;

import java.util.Scanner;

/**
 * Print fibonacci series upto n numbers
 */
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c;
        int count = 1;
        System.out.print(a + ",");
        while (count < n) {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
            count++;
        }
    }
}
