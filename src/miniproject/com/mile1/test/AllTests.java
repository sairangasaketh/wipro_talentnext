package miniproject.com.mile1.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestStudentReport.class,
    TestStudentService.class
})
public class AllTests {
    // No implementation needed. Just acts as a test suite holder.
}
