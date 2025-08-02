package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestPresence {

    DailyTasks dt = new DailyTasks();

    @Test
    public void testCheckPresenceTrue() {
        assertTrue(dt.checkPresence("Wipro Talent Next", "Talent"));
    }

    @Test
    public void testCheckPresenceFalse() {
        assertFalse(dt.checkPresence("Wipro Talent Next", "XYZ"));
    }

    @Test
    public void testCheckPresenceCaseSensitive() {
        assertFalse(dt.checkPresence("TalentNext", "talent")); // Case-sensitive check
    }

    @Test
    public void testCheckPresenceEmptySearch() {
        assertTrue(dt.checkPresence("Wipro", "")); // empty string is always "present"
    }
}
