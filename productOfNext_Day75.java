package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class productOfNext_Day75 {
    static void productNext(int a[]) {
        int multi=1;
        int b[]=new int[a.length];

        for (int i=0;i<a.length;i++) {
            multi=multi*a[i];
        }
        for (int i=0;i<a.length;i++) {
            b[i]=(multi/a[i]);
        }
        System.out.println("Array With Product of Other Element :");
        for (int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        System.out.println("Input : "+Arrays.toString(a));
        productNext(a);
    }
}
