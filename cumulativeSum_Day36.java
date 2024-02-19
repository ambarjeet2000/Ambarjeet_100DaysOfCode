package Ambarjeet_100DaysOfCode;
/* Write a Java program to find the cumulative sum of an array.
Example1:-
Array = {9, 8, 7, 0, -2, 5}
Cumulative sum = [9, 17, 24, 24, 22, 27] */

import java.util.Arrays;

public class cumulativeSum_Day36 {
    static String findCumulativeSum(int[] a)
    {
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            a[i]=sum;
        }
        return "Output : "+Arrays.toString(a);
    }
    public static void main(String[] args) {
        int a[]={9, 8, 7, 0, -2, 5};
        System.out.println("Input : "+Arrays.toString(a));
        System.out.println(findCumulativeSum(a));
    }
}
