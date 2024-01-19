package Ambarjeet_100DaysOfCode;
/* Write a Java program to check whether a given string contains a capital letter,
a lower case letter, a number and a minimum length.
Sample Output:
Input the string: W3resource
['Valid string.'] */

import java.util.Scanner;
public class stringValidation_Day8 {
    static void validString()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc1.next();
        boolean uppercase=false,lowercase=false,digit=false;

        if(str.length()<=5)
        {
            System.out.println("String Length is too Short");
        }
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch))
            {
                uppercase=true;
            } else if (Character.isLowerCase(ch)) {
                lowercase=true;
            } else if (Character.isDigit(ch)) {
                digit=true;
            }
        }
        if (uppercase && lowercase && digit )
        {
            System.out.println(str+ " is a Valid String");
        } else if (!uppercase) {
            System.out.println("Uppercase Letter missing...!");
        } else if (!lowercase) {
            System.out.println("Lowercase Letter Missing...!");
        } else if (!digit) {
            System.out.println("Digit Missing...!");
        }
    }
    public static void main(String[] args) {
        validString();
    }
}
