package java_programming_week4;

import java.util.Scanner;

public class LeftAngleTriangle
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row number");
        printleftTriangle(s.nextInt());
        s.close();
    }
    public static void printleftTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
