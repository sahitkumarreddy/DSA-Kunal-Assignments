package questions.firstJava;

import java.util.Scanner;

/**
 * Take input of 2 numbers and an operator and calculate the value
 * Use if conditions
 */
public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 :");
        int num2 = scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/,%) :");
        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println("Addition value :" + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Subtraction value :" + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Multiplication value :" + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Division denominator cannot be 0");
            }
            System.out.println("Division value :" + (num1 / num2));
        } else if (operator.equals("%")) {
            System.out.println("Modulus value :" + (num1 % num2));
        } else {
            System.out.println("Please select valid operator");
        }
    }
}
