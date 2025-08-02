package miniproject.com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import miniproject.com.mile1.bean.Student;
import miniproject.com.mile1.service.StudentService;

public class TestStudentService {

    StudentService ss = new StudentService();

    Student s1 = new Student("John", new int[]{80, 90, 70});
    Student s2 = new Student(null, new int[]{50, 60, 70});
    Student s3 = new Student("Mike", null);
    Student s4 = null;
    Student s5 = new Student("Sara", new int[]{30, 40, 50});

    Student students[] = {s1, s2, s3, s4, s5};

    @Test
    public void testFindNumberOfNullNames() {
        assertEquals(1, ss.findNumberOfNullNames(students));
    }

    @Test
    public void testFindNumberOfNullObjects() {
        assertEquals(1, ss.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNumberOfNullMarks() {
        assertEquals(1, ss.findNumberOfNullMarks(students));
    }
}
