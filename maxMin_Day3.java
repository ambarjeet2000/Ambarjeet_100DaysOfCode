package Ambarjeet_100DaysOfCode;

// Q. Write a program to find the maximum,minimum,Second max,second min element in an array.
public class maxMin_Day3 {
    static void maxMin(int a[])
    {
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\nMax Element : "+a[a.length-1]);
        System.out.println("Min Element : "+a[0]);
        System.out.println("Second Max Element : "+a[a.length-2]);
        System.out.println("Second Min Element : "+a[1]);
    }
    public static void main(String[] args) {
        int a[]={9,23,14,77,41,2,11,56};
        for (int m : a)
        {
            System.out.print(m+" ");
        }

        maxMin(a);
    }
}
