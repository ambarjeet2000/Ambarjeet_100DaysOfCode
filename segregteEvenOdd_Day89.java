package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class segregteEvenOdd_Day89 {
    static void evenOdd(int a[]) {
        int b[]=new int[a.length];
        int even=0,odd=b.length-1;
        for (int i=0;i<b.length;i++)
        {
            if (a[i]%2==0) {
                b[even]=a[i];
                even++;
            }
            else {
                b[odd]=a[i];
                odd--;
            }
        }
        System.out.println("Output : "+Arrays.toString(b));
    }
    public static void main(String[] args) {
        int a[]={1,9,5,3,2,6,7,11};
        System.out.println("Input : "+Arrays.toString(a));
        evenOdd(a);
    }
}
