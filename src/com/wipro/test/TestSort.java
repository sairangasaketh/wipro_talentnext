package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks dt = new DailyTasks();
        int[] input = {5, 2, 4, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, dt.sortValues(input));
    }

    @Test
    public void testSortValuesEmptyArray() {
        DailyTasks dt = new DailyTasks();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, dt.sortValues(input));
    }

    @Test
    public void testSortValuesSingleElement() {
        DailyTasks dt = new DailyTasks();
        int[] input = {10};
        int[] expected = {10};
        assertArrayEquals(expected, dt.sortValues(input));
    }
}
