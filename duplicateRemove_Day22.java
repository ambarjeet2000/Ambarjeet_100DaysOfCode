package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class duplicateRemove_Day22 {
    public static void removeDuplicate(int a[])
    {
        for (int i=0;i<a.length;i++)
        {
            int c=0;
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    c++;
                }
            }
            if (c==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,2};
        System.out.println(Arrays.toString(a));
        removeDuplicate(a);
    }
}
