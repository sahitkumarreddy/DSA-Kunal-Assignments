package questions.flowOfProgram;

import java.util.Scanner;

/**
 * Take a number as input and print Multiplication Table for it
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        scanner.close();
        printTable(num);
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i);
            System.out.println();
        }
    }
}
