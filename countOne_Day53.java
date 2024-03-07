package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class countOne_Day53 {
    static int countOne(int a[])
    {
        int res=0;
        for (int i=0;i<a.length;i++)
        {
            if (a[i]==1)
            {
                res=a.length-i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={0,0,0,1,1};
        System.out.println("Input : "+Arrays.toString(a));
        System.out.println("Total 1's in Array : "+countOne(a));
    }
}
