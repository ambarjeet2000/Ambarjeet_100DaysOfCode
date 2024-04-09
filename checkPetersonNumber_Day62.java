package Ambarjeet_100DaysOfCode;

import java.util.Scanner;
public class checkPetersonNumber_Day62 {
    static void checkPeterson() {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc1.nextInt();

        int temp=num, sum=0;

        while (temp>0)
        {
            int rem=temp%10;
            int fact=1;
            for (int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if (sum==num)
        {
            System.out.println("Peterson Number");
        }
        else
        {
            System.out.println("Not Peterson Number");
        }
    }
    public static void main(String[] args) {
        checkPeterson();

    }
}
