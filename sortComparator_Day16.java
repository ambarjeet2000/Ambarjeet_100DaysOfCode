package Ambarjeet_100DaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee {
    private int studID;
    private String name;
    private double percentage;
    private int age;
    public Employee(int studID, String name, double percentage, int age) {
        this.studID = studID;
        this.name = name;
        this.percentage = percentage;
        this.age = age;
    }
    public int getStudID() {
        return studID;
    }
    public String getName() {
        return name;
    }
    public double getPercentage() {
        return percentage;
    }
    public int getAge() {
        return age;
    }
}
class sortAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge()-o2.getAge();
    }
}
class sortMarks implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o2.getPercentage()-o1.getPercentage());
    }
}
public class sortComparator_Day16 {
    public static void main(String[] args) {
        List<Employee> emps=new ArrayList<>();
        emps.add(new Employee(101,"Ambarjeet",83.44,24));
        emps.add(new Employee(102,"Kavita   ",91.64,28));
        emps.add(new Employee(103,"Satish   ",74.11,23));
        emps.add(new Employee(104,"Raj      ",67.43,32));
        emps.add(new Employee(105,"Tejaswini",93.59,29));

        System.out.println("==================================");
        System.out.println("* Employee Date *");
        System.out.println("Id\t\tName\t\tPercentage\tAge");
        for (Employee e1 : emps)
        {
            System.out.println(e1.getStudID()+"\t\t"+e1.getName()+"\t"+e1.getPercentage()+"\t\t"+e1.getAge());
        }
        System.out.println("==================================");

        System.out.println("==================================");
        System.out.println("* Sort Age *");
        System.out.println("Id\t\tName\t\tPercentage\tAge");
        Collections.sort(emps,new sortAge());
        for (Employee e1 : emps)
        {
            System.out.println(e1.getStudID()+"\t\t"+e1.getName()+"\t"+e1.getPercentage()+"\t\t"+e1.getAge());
        }
        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("* Sort Marks *");
        System.out.println("Id\t\tName\t\tPercentage\tAge");
        Collections.sort(emps,new sortMarks());
        for (Employee e1 : emps)
        {
            System.out.println(e1.getStudID()+"\t\t"+e1.getName()+"\t"+e1.getPercentage()+"\t\t"+e1.getAge());
        }
        System.out.println("==================================");
    }
}
