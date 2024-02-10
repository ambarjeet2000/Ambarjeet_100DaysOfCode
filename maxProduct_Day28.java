package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class maxProduct_Day28 {
    static int findMaxProduct(int a[])
    {
        Arrays.sort(a); // [-7, -5, 2, 3, 5, 5, 7, 8]
        System.out.println("Pair : "+a[a.length-2]+" "+a[a.length-1]);

        int product=a[a.length-2]*a[a.length-1];

        return product;
    }
    public static void main(String[] args) {
        int a[]={2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println(Arrays.toString(a));
        System.out.println("Max Product : "+findMaxProduct(a));
    }
}
