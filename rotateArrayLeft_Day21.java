package Ambarjeet_100DaysOfCode;
/* Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2 */

import java.util.Arrays;
public class rotateArrayLeft_Day21 {
    static void rotateLeft(int a[])
    {
        int rotation=2;
        for (int i=0;i<rotation;i++)
        {
            int first=a[0]; // 1
            for (int j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[a.length-1]=first; // put at last
        }
        System.out.println("Output : "+Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Input : "+Arrays.toString(a));
        rotateLeft(a);
    }
}
