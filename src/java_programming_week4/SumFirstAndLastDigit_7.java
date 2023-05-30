package java_programming_week4;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 *  gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 *  gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class SumFirstAndLastDigit_7
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= s.nextInt();
        int sum=sumFirstAndLAstDigit(num);
        if(sum==-1)
        {
            System.out.println(sum+"You have entered invalid number");
        }
        {
            System.out.println("Addition of first and last digit is "+sum);
        }
        s.close();
    }
public static int sumFirstAndLAstDigit(int num)
{
    if(num>1)
    {
        int firstDigit=0,lastDigit=num%10;
       while(num>0)
       {
          firstDigit=num%10;
          num=num/10;
       }
       return (firstDigit+lastDigit);
    }
    else{ return -1;}
}
}

