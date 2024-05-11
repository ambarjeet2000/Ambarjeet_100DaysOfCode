package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class numberGame_Day84 {
    public static void main(String[] args) {
        int a[] = {5,4,2,3};
        System.out.println("Input : "+Arrays.toString(a));
        if (a.length%2==0)
        {
            int[] rearrangedArray = numberGame(a);
            System.out.println("Array after arranging elements : "+Arrays.toString(rearrangedArray));
        } else {
            System.out.println("Given input doesn't meet the requirement");
        }
    }
    public static int[] numberGame(int a[]) {
        Arrays.sort(a);
        int length = a.length;
        int[] rearrangedArray = new int[length];

        for (int i=0;i<length;i+=2) {
            rearrangedArray[i]=a[i+1];
            rearrangedArray[i+1]=a[i];
        }
        return rearrangedArray;
    }
}
