package Ambarjeet_100DaysOfCode;

import java.util.Scanner;
public class checkPrimeComposite_Day72 {
    static void checkPC(int num)
    {
        int count = 0;
        for (int i=1; i<=num;i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is a Composite Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc1.nextInt();
        checkPC(num);
    }
}
