package miniproject.com.mile1.service;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.exception.NullNameException;
import miniproject.com.mile1.exception.NullMarksArrayException;
import miniproject.com.mile1.exception.NullStudentException;

public class StudentReport {

    public String findGrades(Student student) {
        int[] marks = student.getMarks();
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        int avg = sum / marks.length;

        if (avg >= 80) return "A";
        else if (avg >= 50) return "B";
        else if (avg >= 35) return "C";
        else return "F";
    }

    public String validate(Student student) throws NullStudentException, NullNameException, NullMarksArrayException {
        if (student == null) throw new NullStudentException();
        if (student.getName() == null) throw new NullNameException();
        if (student.getMarks() == null) throw new NullMarksArrayException();

        return findGrades(student);
    }
}
