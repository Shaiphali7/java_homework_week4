package java_programming_week4;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");

        num = s.nextInt();
        if (isArmstrong(num)) {
            System.out.print("Armstrong number");
        } else {
            System.out.print("Not a Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {

        int temp, digits = 0, last = 0, sum = 0;
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            last = temp % 10;

            sum += (Math.pow(last, digits));

            temp = temp / 10;
        }

        if (num == sum)
            return true;

        else return false;
    }
}




