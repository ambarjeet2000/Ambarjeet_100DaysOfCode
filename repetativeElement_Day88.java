package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class repetativeElement_Day88 {
    static void findRepetative(int a[]) {
        int repeat=0;
        for (int i=0;i<a.length;i++)
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    repeat=a[i];
                }
            }
        System.out.println("Repeatative element : "+repeat);
    }
    public static void main(String[] args) {
        int a[]={1,3,2,3,4};
        System.out.println("Input : "+Arrays.toString(a));
        findRepetative(a);

    }
}
