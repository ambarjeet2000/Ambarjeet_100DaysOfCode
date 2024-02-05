package Ambarjeet_100DaysOfCode;

public class findThirdLargest_Day23 {
    static int thirdLargest(int a[])
    {
        int first=a[0],second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;

        for (int i=1;i<a.length;i++)
        {
            if (a[i]>first)
            {
                third=second;
                second=first;
                first=a[i];
            } else if (a[i]>second) {
                third=second;
                second=a[i];
            } else if (a[i]>third) {
                third=a[i];
            }
        }

        return third;
    }
    public static void main(String[] args) {
        int a[]={2, 7, 1, 3, 5, 9, 6, 8, 4};
        System.out.println(thirdLargest(a));
    }
}
