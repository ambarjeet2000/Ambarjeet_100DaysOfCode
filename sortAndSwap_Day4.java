package Ambarjeet_100DaysOfCode;
// Q. Write a java program to Sort Elements in array and swap last two and first two elements.
public class sortAndSwap_Day4 {
    static void sortSwap(int a[])
    {
        System.out.println("\nSorted Array : ");
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]<a[j]) // Descending Sort
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
        // swap last two without using third variable
        a[a.length-1]=a[a.length-1]+a[a.length-2];
        a[a.length-2]=a[a.length-1]-a[a.length-2];
        a[a.length-1]=a[a.length-1]-a[a.length-2];
        // swap first two using third variable
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;
        System.out.println("\nAfter Swapping Array : ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={14,33,9,23,44,7,11,59,83,68};
        System.out.println("Original Array : ");
        for (int p : a)
        {
            System.out.print(p+" ");
        }
        sortSwap(a);
    }
}
