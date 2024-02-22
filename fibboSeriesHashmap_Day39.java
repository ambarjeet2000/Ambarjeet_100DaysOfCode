package Ambarjeet_100DaysOfCode;

import java.util.HashMap;
import java.util.Map;

public class fibboSeriesHashmap_Day39 {
    static void fibboSeries() {

        int num = 10;
        Map<Integer, Integer> fibbo = new HashMap<>();
        fibbo.put(0, 0);
        fibbo.put(1, 1);
        int i = 0;
        while (i < num - 2) {
            int value = fibbo.get(i) + fibbo.get(i + 1);
            fibbo.put(i + 2, value);
            i++;
        }
        for (int j = 0; j < num; j++) {
            System.out.print(fibbo.get(j) + " ");
        }
    }
    public static void main(String[] args) {
        fibboSeries();
    }
}
