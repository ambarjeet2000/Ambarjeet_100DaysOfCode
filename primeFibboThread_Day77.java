package Ambarjeet_100DaysOfCode;
class primeSeries extends Thread {
    @Override
    public void run() {
        System.out.println("Prime Number Series : ");
        for (int i=5;i<20;i++)
        {
            int count=0;
            for (int j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
class fibboSeries extends Thread {
    @Override
    public void run() {
        System.out.print("\nFibbonaccie Series : ");

        System.out.println();
        int n1=0,n2=1,n3;
        for (int i=1;i<10;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
public class primeFibboThread_Day77 {
    public static void main(String[] args) {
        primeSeries p1=new primeSeries();
        p1.start();

        fibboSeries f1=new fibboSeries();
        f1.start();
    }
}
