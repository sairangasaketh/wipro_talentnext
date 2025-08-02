package Assignments;

import java.io.*;

class Employee implements Serializable {
    private String name;
    private java.util.Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class Q_3 {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee();

            // Set employee properties
            FileOutputStream fileOut = new FileOutputStream("data");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Employee object serialized and saved to 'data' file.");

            // Deserialization
            FileInputStream fileIn = new FileInputStream("data");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee serializedEmployee = (Employee) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Employee object deserialized.");

            // Print properties of deserialized employee object
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }
}