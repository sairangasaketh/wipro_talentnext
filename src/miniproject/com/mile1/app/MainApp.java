package miniproject.com.mile1.app;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.service.StudentReport;
import miniproject.com.mile1.service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("John", new int[]{85, 90, 80});
        students[1] = new Student(null, new int[]{50, 60, 70});
        students[2] = new Student("Mike", null);
        students[3] = null;
        students[4] = new Student("Sara", new int[]{30, 35, 20});

        StudentReport sr = new StudentReport();
        StudentService ss = new StudentService();

        for (int i = 0; i < students.length; i++) {
            try {
                String grade = sr.validate(students[i]);
                System.out.println("Grade = " + grade);
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Null Marks: " + ss.findNumberOfNullMarks(students));
        System.out.println("Null Names: " + ss.findNumberOfNullNames(students));
        System.out.println("Null Objects: " + ss.findNumberOfNullObjects(students));
    }
}
