package Ambarjeet_100DaysOfCode;
// Design a City class that implements Comparable for sorting cities based on their population density.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cityAccordingDensity_Day74 implements Comparable<cityAccordingDensity_Day74>{
    private int city_Id;
    private String city_Name;
    private double city_Population;
    public cityAccordingDensity_Day74(int city_Id, String city_Name, double city_Population) {
        this.city_Id = city_Id;
        this.city_Name = city_Name;
        this.city_Population = city_Population;
    }
    public int getCity_Id() {
        return city_Id;
    }
    public String getCity_Name() {
        return city_Name;
    }
    public double getCity_Population() {
        return city_Population;
    }
    @Override
    public int compareTo(cityAccordingDensity_Day74 o) {

        return o.city_Id-this.city_Id ;
    }
    public static void main(String[] args) {
        List<cityAccordingDensity_Day74> a1=new ArrayList<>();
        a1.add(new cityAccordingDensity_Day74(11,"Mumbai   ",12442573));
        a1.add(new cityAccordingDensity_Day74(12,"Nagpur   ",2405665));
        a1.add(new cityAccordingDensity_Day74(13,"Chennai  ",4646732));
        a1.add(new cityAccordingDensity_Day74(14,"Pune     ",3124458));
        a1.add(new cityAccordingDensity_Day74(15,"Hyderabad",6993262));

        System.out.println("*** City List ***");
        System.out.println("city_ID\t\tcity_Name\tcity_Population");

        for (cityAccordingDensity_Day74 c1 : a1) {
            System.out.println(c1.getCity_Id()+"\t\t\t"+c1.getCity_Name()+"\t\t"+c1.getCity_Population());

        }

        System.out.println("*** City According Population ***");
        Collections.sort(a1);
        System.out.println("city_ID\t\tcity_Name\tcity_Population");

        for (cityAccordingDensity_Day74 c1 : a1) {
            System.out.println(c1.getCity_Id()+"\t\t\t"+c1.getCity_Name()+"\t\t"+c1.getCity_Population());

        }
    }
}
