package java_programming_week4;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber_9
{
    public static void main(String[] args)
    {
      int num1,num2,sum,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        fibonacciSeries(num);
    }
    public static void fibonacciSeries(int num)
    {
        int num1,num2,sum,i;
        num1=0;
        num2=1;
        System.out.print(num1+" "+num2);
        for(i=2;i<num;i++)
        {
            sum=num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }
    }
}
