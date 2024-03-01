package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

// Find out highest numbers in an Array whose adjacent right numbers are smaller
public class adjecentSmallerFind_Day47 {
    static void findAdjecent(int a[])
    {
        System.out.print("Adjacent Smaller Number : " );
        for (int i=0;i<a.length-1;i++)
        {
            if (a[i]>a[i+1])
            {
                System.out.print(a[i]+" ");
            }
        }
        if (a[a.length-1] > a[0])
        {
            System.out.print(a[a.length-1]);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,4,3,5,2};
        System.out.println("Input : "+Arrays.toString(a));
        findAdjecent(a);
    }
}
