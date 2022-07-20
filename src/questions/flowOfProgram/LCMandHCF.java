package questions.flowOfProgram;

import java.util.Scanner;

/**
 * Take 2 numbers as input and find their LCM and HCF
 */
public class LCMandHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2:");
        int num2 = scanner.nextInt();
        scanner.close();
        printLCMandHCF(num1, num2);
    }

    public static void printLCMandHCF(int num1, int num2) {
        //Method-1
        /* int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;*/

        //Method2 - efficient

        int hcf = findHCF(num1, num2);
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF is :" + hcf);
        System.out.println("LCM is :" + lcm);
    }

    static int findHCF(int num1, int num2) {
        return num2 == 0 ? num1 : findHCF(num2, num1 % num2);
    }
}
