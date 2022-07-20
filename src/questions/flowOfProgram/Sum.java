package questions.flowOfProgram;

import java.util.Scanner;

/**
 * Take 2 numbers and print the sum of both
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scanner.nextInt();

        System.out.println("Sum is :" + (num1 + num2));
    }
}
