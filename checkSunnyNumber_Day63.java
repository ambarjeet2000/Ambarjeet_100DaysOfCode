package Ambarjeet_100DaysOfCode;

import java.util.Scanner;
public class checkSunnyNumber_Day63 {
    static void checkSunny()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc1.nextInt();
        int c=0;
        for (int i=1;i<num/2;i++)
        {
            if (i*i==(num+1))
            {
                c++;
            }
        }
        if (c>0) {
            System.out.println("Sunny Number...!!!");
        }
        else {
            System.out.println("Not a Sunny Number...!!!");
        }
    }
    public static void main(String[] args) {
        checkSunny();
    }
}
