package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class majorityElement_Day33 {
    static void findMajority(int a[])
    {
        for (int i=0;i<a.length;i++)
        {
            int c=1;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    c++;
                }
            }
            if (c>=a.length/2)
            {
                System.out.println("Output : "+a[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,2,1,1,1,2,2};
        System.out.println("Input : "+Arrays.toString(a));
        findMajority(a);
    }
}
