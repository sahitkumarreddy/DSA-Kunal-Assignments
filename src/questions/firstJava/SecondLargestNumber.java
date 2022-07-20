package questions.firstJava;

import java.util.Scanner;

/**
 * Take 3 numbers as input and print second largest number
 */
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 :");
        int num2 = scanner.nextInt();
        System.out.println("Enter number3 :");
        int num3 = scanner.nextInt();

        //Method 1
        if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
            System.out.println("Second largest is : " + num1);
        } else if (num2 > num3 && num2 < num1 || num2 < num3 && num2 > num1) {
            System.out.println("Second largest is : " + num2);
        } else {
            System.out.println("Second largest is : " + num3);
        }

        //Method-2
        //Find the largest and smallest number: 2nd largest = sum of 3 numbers - (sum of largest + smallest)

        //Largest
        int largest = 0;
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        //Smallest
        int smallest = 0;
        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        int secondLargest = (num1 + num2 + num3) - (largest + smallest);
        System.out.println("Second largest is : " + secondLargest);

    }
}
