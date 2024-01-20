package Ambarjeet_100DaysOfCode;

import java.util.Scanner;

/* Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
Examples:
Input: arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2
Output: 4 // x (or 2) occurs 4 times in arr[] */
public class occurence_Day9 {
    static String occurence(int[] a)
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Element to find Occurence : ");
        int occ=sc1.nextInt();
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]==occ)
            {
                c++;
            }
        }
        return c + " times occurs in a[]";
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,2,3};
        System.out.println(occurence(a));
    }
}
