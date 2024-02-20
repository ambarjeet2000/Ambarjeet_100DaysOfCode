package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class closeToZero_Day37 {
    static int findElement(int a[])
    {
        int closeNum=0;
        int minDifference=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++)
        {
            int diff=Math.abs(a[i]-0);
            if (diff<minDifference || (diff==minDifference && a[i]>closeNum))
            {
                minDifference=diff;
                closeNum=a[i];
            }
        }
        return closeNum;
    }
    public static void main(String[] args) {
        int a[]={-4,-2,1,4,8};
        System.out.println("Input : "+Arrays.toString(a));
        System.out.println("Element close to zero : "+findElement(a));
    }
}
