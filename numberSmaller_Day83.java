package Ambarjeet_100DaysOfCode;

import java.util.Arrays;

public class numberSmaller_Day83 {
    public static void main(String[] args) {
        int a[]={8,1,2,2,3};
        System.out.println("Input : "+Arrays.toString(a));
        int[] numbersSmaller = findnumbersSmaller(a);
        System.out.println("Numbers smaller than the current number : " + Arrays.toString(numbersSmaller));
    }
    public static int[] findnumbersSmaller(int a[]) {
        int maxNumber = findMaximumNumber(a);
        int[] numberCount = findNumberCount(a, maxNumber);
        int[] numbersSmaller = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                numbersSmaller[i] = 0;
            } else {
                numbersSmaller[i] = numberCount[a[i] - 1];
            }
        }
        return numbersSmaller;
    }
    public static int findMaximumNumber(int a[]) {
        int maxNumber = 0;
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
    public static int[] findNumberCount(int a[], int maxNumber) {
        int[] numberCount = new int[maxNumber + 1];
        for (int i = 0; i < a.length; i++) {
            numberCount[a[i]]++;
        }

        for (int i = 1; i < numberCount.length; i++) {
            numberCount[i] += numberCount[i - 1];
        }
        return numberCount;
    }
}
