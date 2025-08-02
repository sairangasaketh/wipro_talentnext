package Inheritence;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000.00, 2015, "AB123456C");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        emp.setAnnualSalary(55000.00);
        emp.setYearStarted(2016);
        emp.setNationalInsuranceNumber("CD987654E");

        System.out.println("\nUpdated Employee Details:");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
