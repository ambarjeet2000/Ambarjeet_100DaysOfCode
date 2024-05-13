package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class alternateSort_Day86 {
    static void altSort(int a[]) {
        Arrays.sort(a);
        int b[]=new int[a.length];
        int left=0,right=a.length-1;

        for (int i=0;i<a.length;i++)
        {
            if (i%2==0) {
                b[i]=a[right];
                right--;
            } else {
                b[i]=a[left];
                left++;
            }
        }
        System.out.print("New Array : ");
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args) {
        int a[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original Array : "+Arrays.toString(a));
        altSort(a);
    }
}
