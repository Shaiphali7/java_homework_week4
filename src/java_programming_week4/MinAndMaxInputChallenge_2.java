package java_programming_week4;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge_2 {
   static int num, count=1 , high, low;

    public static void main(String[] args) {
        MinAndMaxInputChallenge_2 obj = new MinAndMaxInputChallenge_2();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers to check its min or max");
        num = s.nextInt();
        high=num;
        low=num;
        while(count<=4){
            System.out.println("Enter numbers to check its min or max");
            num = s.nextInt();
            boolean value = intCheck(num);
            if (value==true)
            {
                count++;
                if(count>0 && num>high)
                {
                    high=num;
                }
            else if(count>0 && num<low)
                {
                    low=num;
                }

            }
           else
           {
               System.out.println("It is a invalid number");
               break;
            }

        };
        System.out.println("Largest integer entered "+high);
        System.out.println("lowest integer entered "+low);
s.close();

    }

    public static boolean intCheck(int num) {
        if (0 <= num) {
            return true;
        }
        {
            return false;
        }

    }
}
