package Ambarjeet_100DaysOfCode;
/* Write a Java program to find the cumulative sum of an array.
Example1:-
Array = {9, 8, 7, 0, -2, 5}
Cumulative sum = [9, 17, 24, 24, 22, 27] */
public class cumulativeSum_Day14 {
    static void findSum(int a[])
    {
        System.out.print("\nCumulative sum = ");
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            System.out.print(sum+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={9,8,7,0,-2,5};
        System.out.print("Array : ");
        for (int p : a)
        {
            System.out.print(p+" ");
        }
        findSum(a);
    }
}
