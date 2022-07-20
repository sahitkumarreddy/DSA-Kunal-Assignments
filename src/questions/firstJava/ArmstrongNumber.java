package questions.firstJava;

import java.util.Scanner;

import static java.lang.Math.log10;

/**
 * Check if given number is Armstrong Number or not
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        int orgNum = num;
        double armNum = 0;

        double numOfDigits = 1 + Math.floor(log10(num));

        while (num > 0) {
            int rem = num % 10;
            armNum = armNum + Math.pow(rem, numOfDigits);
            num = num / 10;
        }

        if (orgNum == armNum) {
            System.out.println("Given number is Armstrong Number");
        } else {
            System.out.println("Given number is not Armstrong Number");
        }
    }
}
