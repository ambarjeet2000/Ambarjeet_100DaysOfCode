package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class increaseDigit_Day49 {
    static int[] increaseOne(int[] a)
    {
        int len=a.length;
        if (len-1!=9)
        {
            a[len-1]=a[len-1]+1;
            return a;
        }
        int i=len-1;
        while (i>=0)
        {
            if (a[i]==9)
            {
                a[i]=0;
            } else if (a[i]!=9){
                a[i]=a[i]+1;
                break;
        }
            i--;
        }
        if (i==-1)
        {
            int b[]=new int[len+1];
            b[0]=1;
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println("Input : "+Arrays.toString(a));
        int result[]=increaseOne(a);
        System.out.println("Array After increment : "+Arrays.toString(result));
    }
}
