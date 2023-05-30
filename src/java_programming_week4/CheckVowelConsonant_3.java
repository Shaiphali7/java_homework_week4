package java_programming_week4;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class CheckVowelConsonant_3
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any character");
        char ch=s.next().charAt(0);
        boolean check=checknumber(ch);
        if(check==true)
        {
            checkVowelAndConsonant(ch);
        }
        else{ System.out.println("It's not a character");}
        s.close();

    }
    public static boolean checknumber(char ch)
    {
        if(ch>='0'&& ch<='9')
        {

            return false;
        }
        else
        {
          return true;
        }

    }
    public static void checkVowelAndConsonant(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+" is a vowel");
        }
        else{
            System.out.println(ch+" is a consonant");
        }

    }

}
