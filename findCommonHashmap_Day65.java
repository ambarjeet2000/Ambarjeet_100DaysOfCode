package Ambarjeet_100DaysOfCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findCommonHashmap_Day65 {
    static Set<Integer> findCommon(HashMap<String,Integer> h1,HashMap<String,Integer> h2)
    {
        Set<Integer> common=new HashSet<>();
        for (String key : h1.keySet())
        {
            if (h2.containsKey(key) && h2.get(key).equals(h1.get(key)))
            {
                common.add(h1.get(key));
            }
        }
        return common;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("apple", 10);
        h1.put("banana", 20);
        h1.put("cherry", 30);

        System.out.println(h1);

        HashMap<String, Integer> h2 = new HashMap<>();
        h2.put("apple", 10);
        h2.put("banana", 20);
        h2.put("orange", 40);

        System.out.println(h2);

        System.out.println("Common keys : "+findCommon(h1,h2));
    }
}
