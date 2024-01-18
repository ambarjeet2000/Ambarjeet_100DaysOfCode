package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
// Write a program to merge two sorted arrays into a single sorted array.
public class mergeArray_Day7 {
    static void merge(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
       for (int i=0;i<a.length;i++) // a[] merge in c[]
       {
           c[i]=a[i];
       }
       for (int i=0;i<b.length;i++) // b[] merge in c[]
       {
           c[i+a.length]=b[i];
       }
        System.out.print("\nMerge : ");
       for (int i=0;i<c.length;i++) // merge in c[]
       {
           Arrays.sort(c);
           System.out.print(c[i]+" ");
       }
    }
    public static void main(String[] args) {
        int a[]={24,17,56,82,33};
        System.out.print("1st Array : ");
        for (int k : a)
        {
            System.out.print(k+" ");
        }
        int b[]={7,78,55,40,97,19,23};
        System.out.print("\n2nd Array : ");
        for (int p : b)
        {
            System.out.print(p+" ");
        }
        merge(a,b);
    }
}
