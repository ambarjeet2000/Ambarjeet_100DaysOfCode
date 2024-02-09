package Ambarjeet_100DaysOfCode;

import java.util.Scanner;
public class palindromeConditional_Day27 {
    static Scanner sc1=new Scanner(System.in);
    static void checkPalindrome()
    {
        System.out.print("Enter Number : ");
        int num=sc1.nextInt();
        int temp=num;
        int rev=0;
        while (num!=0) {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (temp==rev) {
            System.out.println(temp+" is Palindrome Number");
            findSum(temp);
        }
        else {
            System.out.println(temp+" is not Palindrome Number");
            findAverage(temp);
        }
    }
    static void findSum(int num)
    {
        int sum=0;
        while (num>0)
        {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum : "+sum);
    }
    static void findAverage(int num)
    {
        int sum=0,c=0;
        while (num>0)
        {
            int digit=num%10;
            sum=sum+digit;
            c++;
            num=num/10;
        }
        System.out.println("Average : "+sum/c);
    }
    public static void main(String[] args) {
        checkPalindrome();

    }
}
