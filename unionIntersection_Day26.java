package Ambarjeet_100DaysOfCode;
import java.util.Arrays;
public class unionIntersection_Day26 {
    static void UIfind(int a[],int b[],int c[])
    {
        System.out.print("Union : ");
        for (int i=0;i<c.length;i++)
        {
            int count=0;
            for (int j=i+1;j<c.length;j++)
            {
                if (c[i]==c[j])
                {
                    count++;
                }
            }
            if (count==0)
            {
                System.out.print(c[i]+" ");
            }
        }
        System.out.print("\nIntersection : ");
        for (int i=0;i<c.length;i++ )
        {
            int count=0;
            for (int j=i+1;j<c.length ;j++ )
            {
                if (c[i]==c[j])
                {
                    count++;
                }
            }
            if (count!=0)
            {
                System.out.print(c[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1, 3, 4, 5, 7};
        int b[]={2, 3, 5, 6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int c[]=new int[a.length+b.length];
        for (int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++)
        {
            c[i+a.length]=b[i];
        }
        UIfind(a,b,c);
    }
}
