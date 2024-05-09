package Ambarjeet_100DaysOfCode;

import java.util.TreeSet;

public class maxInTreeset_Day82 {
    public static void main(String[] args) {
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(14);
        t1.add(3);
        t1.add(9);
        t1.add(22);
        t1.add(11);

        System.out.println(t1);
        System.out.println("Maximum : "+t1.last());
    }
}
