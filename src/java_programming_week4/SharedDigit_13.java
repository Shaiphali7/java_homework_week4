package java_programming_week4;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two digit number with in range 10-99");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        if (hasSharedDigit(num1, num2)) {
            System.out.println("Number " + num1 + " and " + num2 + " are valid number");
        } else {
            System.out.println("Number " + num1 + " and " + num2 + " are not valid number");
        }
        s.close();
    }


    public static boolean hasSharedDigit(int num1, int num2) {
        if (10 <= num1 && num1 <= 99 && 10 <= num2 && num2 <= 99) {
            int a = num1 % 10;
            int b = num2 % 10;
            int c = num1 / 10;
            int d = num2 / 10;
            return (a == d || a == b || b == c || c == d);
        } else return false;
    }
}
