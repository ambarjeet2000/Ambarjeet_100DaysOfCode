package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class frequencyMatrix_Day17 {
    static int findFrequency(int a[][])
    {
        int row=a.length,col=a[0].length,
        even=0,odd=0;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (a[i][j]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        System.out.println("Odd Frequency : "+odd);
        return even;
    }
    public static void main(String[] args) {
        int a[][]= new int[][]
                {       {21,33,18},
                        {44,51,63},
                        {70,86,99}
                };
        for (int[] p : a)
        {
            System.out.println(Arrays.toString(p));
        }
        System.out.println("Even Frequency : "+findFrequency(a));
    }
}
