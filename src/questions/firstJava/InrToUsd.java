package questions.firstJava;

import java.util.Scanner;

/**
 * Take input in rupees and convert to USD
 * Assume 1USD = INR79.95
 */
public class InrToUsd {
    private static final double USD = 79.95;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter INR currency: ");
        double rupees = scanner.nextFloat();

        double usd = rupees / USD;

        System.out.printf("INR %.2f is %.2f USD", rupees, usd);
    }
}
