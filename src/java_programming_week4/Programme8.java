package java_programming_week4;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme8
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        drawPattern(num);
    }
    public static void drawPattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println(" ");
        }

    }
}
