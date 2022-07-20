package questions.flowOfProgram;

import java.util.Scanner;

/**
 * Keep taking numbers as input until user enter 'x'
 * After that print sum of all
 */
public class PrintSumUntilX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else if (scanner.next().equalsIgnoreCase("x")) {
                break;
            }
        }

        System.out.println("Total sum is :" + sum);
    }
}
