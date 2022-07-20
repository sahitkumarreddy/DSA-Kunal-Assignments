package questions.flowOfProgram;

import java.util.Scanner;

/**
 * Input a year and find whether it is leap year or not
 */
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.close();
        isLeapYear(year);

    }

    public static void isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap year");
        }
    }

}

