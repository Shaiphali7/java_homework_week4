package java_programming_week4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        //boolean prime = primeNumber(num);
        if (primeNumber(num)) {
            System.out.println("Number " + num + " is a prime number");
        }else
        {
            System.out.println("Number " + num + " is not a prime number");
        }
    }

    public static boolean primeNumber(int num) {
        boolean flag=true;
        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
