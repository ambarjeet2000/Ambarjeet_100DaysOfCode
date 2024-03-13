package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class pairDifference_Day59 {
    static void findDiff(int a[])
    {
        int target=7;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[j]-a[i]==target)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,7,8,9,11};
        System.out.println("Input : "+Arrays.toString(a));
        findDiff(a);
    }
}
