package questions.firstJava;

import java.util.Scanner;

/**
 * Take Input P, T, R from user and find simple interest
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle:");
        int principle = scanner.nextInt();
        System.out.println("Enter time in years:");
        int time = scanner.nextInt();
        System.out.println("Enter the rate of interest:");
        float rate = scanner.nextFloat();

        float interest = (principle * time * rate) / 100;
        System.out.println("Interest is :" + interest);
        System.out.println("Total amount is :" + (principle + interest));
    }
}
