package questions.firstJava;

import java.util.Scanner;

/**
 * Take 3 numbers as input and print largest number
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 :");
        int num2 = scanner.nextInt();
        System.out.println("Enter number3 :");
        int num3 = scanner.nextInt();

        //Method1
       /* int largest = 0;
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("Largest number is " + largest);*/

        //Method2
        int largestNum = Math.max(num1, Math.max(num2, num3));
        System.out.println("Largest number is " + largestNum);
    }
}
