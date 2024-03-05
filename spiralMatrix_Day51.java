package Ambarjeet_100DaysOfCode;

public class spiralMatrix_Day51 {
    static void printSpiral(int a[][])
    {
        int m=4,n=4;
        int left=0,top=0;
        int right=m-1,bottom=n-1;

        System.out.print("Spiral Form : ");
        while (left<=right && top<=bottom)
        {
            for (int i=left;i<=right;i++)
            {
                System.out.print(a[top][i]+" ");
            }
            top++;
            for (int i=top;i<=bottom;i++)
            {
                System.out.print(a[i][right]+" ");
            }
            right--;
            if (left<=right)
            {
                for (int i=right;i>=left;i--)
                {
                    System.out.print(a[bottom][i]+" ");
                }
                bottom--;
                if (top<=bottom)
                {
                    for (int i=bottom;i>=top;i--)
                    {
                        System.out.print(a[i][left]+" ");
                    }
                    left++;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Input : ");
        int a[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        printSpiral(a);
    }
}
