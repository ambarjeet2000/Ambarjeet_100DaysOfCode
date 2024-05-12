package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class replaceLeftSquare_Day85 {
    static void replaceWithLeftSquare(int a[]) {
        for (int i=0;i<a.length;i++)
        {
            if (a[i]<0)
            {
                int left=i-1;
                while (left>=0 && a[left]<0)
                {
                    left--;
                }
                if (left>=0) {
                    a[i]=a[left]*a[left];
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={12,3,-19,29,5,-61,44,7,-9};
        System.out.println("Input : "+Arrays.toString(a));
        replaceWithLeftSquare(a);
        System.out.println("Output : "+Arrays.toString(a));
    }
}
