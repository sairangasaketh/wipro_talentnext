package Assignments.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Q_7 {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        // Adding some employee objects to the vector
        employees.add(new Employee());
        employees.add(new Employee());

        System.out.println("Listing employees using Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            System.out.println(employee.empId + " " + employee.empName);
        }

        System.out.println("\nListing employees using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.empId + " " + employee.empName);
        }
    }
}
