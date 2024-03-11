package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class tripletSum_Day57 {
    private static void findSum(int[] a)
    {
        int sum=7;
        System.out.println("Triplet of Sum "+sum+" : ");
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                for (int k=j+1;k<a.length;k++) {
                    if (a[i]+a[j]+a[k]==sum) {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1, 6, 3, 0, 8, 4, 1, 7};
        System.out.println("Input : "+Arrays.toString(a));
        findSum(a);
    }
}
