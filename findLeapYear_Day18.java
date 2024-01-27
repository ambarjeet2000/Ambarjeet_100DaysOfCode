package Ambarjeet_100DaysOfCode;

import java.util.Scanner;

public class findLeapYear_Day18 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Starting and Ending Year : ");
        int stryr=sc1.nextInt();
        int endyr=sc1.nextInt();

        System.out.println("Leap Years from "+stryr+" and "+endyr+" :");
        for (int i=stryr;i<=endyr;i++)
        {
            if (i%100==0)
            {
                System.out.println(i);
            }
            else if (i%4==0)
            {
                System.out.println(i);
            }
        }
    }
}
