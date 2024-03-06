package Ambarjeet_100DaysOfCode;

import java.util.TreeSet;
public class greaterThanEqual_Day52 {
    static void findGreat()
    {
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(54);
        t1.add(23);
        t1.add(14);
        t1.add(4);
        t1.add(33);
        t1.add(47);
        t1.add(41);

        System.out.println("Input : "+t1);
        System.out.println("Greater Than 33 : "+t1.higher(33));

    }
    public static void main(String[] args) {
        findGreat();
    }
}
