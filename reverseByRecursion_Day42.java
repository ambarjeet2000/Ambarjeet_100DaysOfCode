package Ambarjeet_100DaysOfCode;

import java.util.Scanner;

public class reverseByRecursion_Day42 {
    static void reverse(int num)
    {
        if (num<10) {
            System.out.println(num);
        }
        else {
            System.out.print(num%10);
            reverse(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter a number : ");

        int num=sc1.nextInt();
        reverse(num);
    }
}
