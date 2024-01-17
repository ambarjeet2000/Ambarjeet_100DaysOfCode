package Ambarjeet_100DaysOfCode;

import java.util.Scanner;

public class checkPalindrome_Day6 {
    static void numPalindrome(int num)
    {
        int temp=num;
        int rev=0;
        while (num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (temp==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
    static void stringPalindrome(String str)
    {
        String rev="";
        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Number/String : ");
        if (sc1.hasNextInt())
        {
            int num=sc1.nextInt();
            numPalindrome(num);
        }
        else
        {
            String str=sc1.next();
            stringPalindrome(str);
        }
    }
}
