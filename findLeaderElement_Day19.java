package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class findLeaderElement_Day19 {
    static void findLeader(int a[])
    {
        System.out.print("Leader Elements : ");
        int max=a[a.length-1];
        System.out.print(max+" ");
        for (int i=a.length-2;i>=0;i--)
        {
            if (a[i]>=max)
            {
                max=a[i];
                System.out.print(max+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        System.out.println(Arrays.toString(a));
        findLeader(a);
    }
}
