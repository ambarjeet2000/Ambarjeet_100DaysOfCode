package Ambarjeet_100DaysOfCode;

public class findAverageGreater_Day13 {
    static void findAvg(int a[])
    {
        double avg=0,sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            avg=sum/a.length;
        }
        System.out.println("Average : "+avg);

        System.out.print("Elements Greater Than Average : ");
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>avg)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        findAvg(a);
    }
}
