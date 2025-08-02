package miniproject.com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.exception.NullMarksArrayException;
import miniproject.com.mile1.exception.NullNameException;
import miniproject.com.mile1.exception.NullStudentException;
import miniproject.com.mile1.service.StudentReport;

public class TestStudentReport {

    StudentReport sr = new StudentReport();

    @Test
    public void testGradeA() throws Exception {
        Student s = new Student("John", new int[]{90, 85, 80});
        assertEquals("A", sr.validate(s));
    }

    @Test
    public void testGradeC() throws Exception {
        Student s = new Student("Sam", new int[]{45, 40, 35});
        assertEquals("C", sr.validate(s));
    }

    @Test
    public void testGradeF() throws Exception {
        Student s = new Student("Tom", new int[]{10, 20, 25});
        assertEquals("F", sr.validate(s));
    }

    @Test
    public void testNullStudentException() {
        assertThrows(NullStudentException.class, () -> {
            sr.validate(null);
        });
    }

    @Test
    public void testNullNameException() {
        Student s = new Student(null, new int[]{50, 60, 70});
        assertThrows(NullNameException.class, () -> {
            sr.validate(s);
        });
    }

    @Test
    public void testNullMarksArrayException() {
        Student s = new Student("Tim", null);
        assertThrows(NullMarksArrayException.class, () -> {
            sr.validate(s);
        });
    }
}
