package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {

    DailyTasks dt = new DailyTasks();

    @Test
    public void testDoStringConcat() {
        String result = dt.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }

    @Test
    public void testSortValues() {
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, dt.sortValues(input));
    }

    @Test
    public void testCheckPresenceTrue() {
        assertTrue(dt.checkPresence("JUnit is awesome", "awesome"));
    }

    @Test
    public void testCheckPresenceFalse() {
        assertFalse(dt.checkPresence("JUnit is awesome", "bad"));
    }
}
