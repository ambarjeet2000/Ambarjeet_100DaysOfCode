package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class moveZeroToEnd_Day41 {
    static void findMinOpr(int[] a)
    {
        int z=0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]!=0)
            {
                a[z]=a[i];
                z++;
            }
        }
        for (int i=z;i<a.length;i++)
        {
            a[i]=0;
        }
        System.out.println("Output : "+Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[]={0,7,24,0,13,0};
        System.out.println("Input : "+Arrays.toString(a));
        findMinOpr(a);
    }
}
