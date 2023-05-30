package java_programming_week4;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class ReadingUserInputChallenge_1 {
    static int sum;
    int num;

    public static void main(String[] args) {
        ReadingUserInputChallenge_1 obj = new ReadingUserInputChallenge_1();
        Scanner s = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println("enter number#" + i);
            obj.num = s.nextInt();
            boolean b = hasNextInt(obj.num);
            if (b == true) {
                sum = nextInt(obj.num);
            } else {
                System.out.println("Invalid number");
                i=0;
            }
            i++;
        }
        System.out.println("The sum of all number is: "+sum);
        s.close();
    }

    public static boolean hasNextInt(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int nextInt(int num) {
        sum = sum + num;
        return sum;
    }
}
