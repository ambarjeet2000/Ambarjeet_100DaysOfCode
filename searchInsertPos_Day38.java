package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.Scanner;
public class searchInsertPos_Day38 {
    static int findPosition(int a[])
    {
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter Element to search Index Position : ");
        int k=sc1.nextInt();
        for (int i=0;i<a.length;i++)
        {
            if (k<=a[i])
            {
                return i;
            }
        }
        return a.length;
    }
    public static void main(String[] args) {
        int a[]={1,3,5,6};
        System.out.println(Arrays.toString(a));
        System.out.println("Index position : "+findPosition(a));
    }
}
