package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
public class findLargestGap_Day87 {
    static int maxGapFind(int a[]) {
        Arrays.sort(a);
        int maxgap=0;
        for (int i=0;i<a.length-1;i++)
        {
            maxgap=Math.max(maxgap,a[i+1]-a[i]);
        }
        return maxgap;
    }
    public static void main(String[] args) {
        int a[]={23,-2,45,38,12,4,6};
        System.out.println("Input : "+Arrays.toString(a));
        System.out.println("Largest Gap : "+maxGapFind(a));
    }
}
