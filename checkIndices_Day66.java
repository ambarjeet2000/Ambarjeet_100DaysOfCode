package Ambarjeet_100DaysOfCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkIndices_Day66 {
    static boolean containsNearbyDuplicate(int a[], int k) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (m1.containsKey(a[i]) && i - m1.get(a[i]) <= k) {
                return true;
            }
            m1.put(a[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1 };
        System.out.println("Input : "+Arrays.toString(a));
        int k = 3;
        boolean result = containsNearbyDuplicate(a, k);
        System.out.println("Contains duplicates with an index difference less than " + k + " is " + result);
    }
}
