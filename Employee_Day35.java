package Ambarjeet_100DaysOfCode;
/*Sorting Employees:
Create a class for Employee with attributes like name, salary, and department.Use the Comparator interface to sort a list of Employee objects by salary in descending order.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee_Day35 {
    private String name;
    private double salary;
    private String department;
    public Employee_Day35(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "\nEmployee {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
    static class salSort implements Comparator<Employee_Day35>
    {
        @Override
        public int compare(Employee_Day35 o1, Employee_Day35 o2) {
            return (int) (o2.salary-o1.salary);
        }
    }
    public static void main(String[] args) {
        List<Employee_Day35> l1=new ArrayList<>();
        l1.add(new Employee_Day35("Ravindra",56897.41,"IT"));
        l1.add(new Employee_Day35("Ambarjeet",33521.63,"Sales"));
        l1.add(new Employee_Day35("Kavita",29916.58,"Marketing"));
        l1.add(new Employee_Day35("Satish",47000.89,"Maintenance"));
        l1.add(new Employee_Day35("Raj",17896.29,"Research"));

        System.out.println("*** List of Employee ***");

        System.out.println(l1);

        System.out.println("*** Sort By Highest Salary ***");
        Collections.sort(l1,new salSort());

        System.out.println(l1);
    }
}
