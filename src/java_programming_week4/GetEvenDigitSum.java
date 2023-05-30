package java_programming_week4;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class GetEvenDigitSum
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int sum = getEvenDigitSum(num);
        if(sum==-1){
            System.out.println("It's a invalid number and sum is "+sum);
        }
        System.out.println("Addition of all the even digit of number " + num + " is: " + sum);
        s.close();
    }
    public static int getEvenDigitSum(int num)
    {
        int sum=0,evenDigit=0,anyDigit;
        if(num>0)
        {
            while(num>0)
            {
                evenDigit=num%10;
                if(evenDigit%2==0)
                {
                    sum=sum+evenDigit;
                }
                num=num/10;
            }
            return sum;
        }
        else return -1;

    }


}
