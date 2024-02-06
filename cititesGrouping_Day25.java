package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class cititesGrouping_Day25 {
    static void groupByCities(List<String>city)
    {
        Map<Character,List<String>> firstLetter=city.stream()
                .collect(Collectors.groupingBy(c->c.charAt(0)));

        firstLetter.forEach((key,value)->
                System.out.println("Cities starts from "+key+" : "+value));

    }
    public static void main(String[] args) {
        List<String> city=new ArrayList<>(Arrays.asList("Amravati","Pune","Chennai","Nagpur","Banglore","Chandigarh","Patiala"));

        System.out.println(city);
        groupByCities(city);

    }
}
